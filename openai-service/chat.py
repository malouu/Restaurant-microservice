from fastapi import FastAPI
from langchain.chat_models import ChatOpenAI
from langchain.prompts.chat import (
    ChatPromptTemplate,
    HumanMessagePromptTemplate,
   
)
from langchain.output_parsers import PydanticOutputParser
from pydantic import BaseModel, Field
from dotenv import load_dotenv
from pathlib import Path

import os

app = FastAPI()

load_dotenv()

OPENAI_MODEL = "gpt-3.5-turbo"
OPENAI_API_KEY = os.getenv("OPENAI_API_KEY")

class Summary(BaseModel):
   
    overall: str = Field(description="The overall summary of the text.")
def prompting(text : str, character : int): 
    
    PROMPT_text_INFO = """
        Provide Summary to this text {text} with maximum {character} characters. translate with the text language".
        {format_instructions}
        """
        # Set up a parser + inject instructions into the prompt template.
    parser = PydanticOutputParser(pydantic_object=Summary)

        # setup the chat model
    llm = ChatOpenAI(openai_api_key=OPENAI_API_KEY, model_name=OPENAI_MODEL)
    message = HumanMessagePromptTemplate.from_template(
        template=PROMPT_text_INFO,
    )
    chat_prompt = ChatPromptTemplate.from_messages([message])

        # get  input
    
    my_input =[text, character]

        # generate the response
    print("Generating response...")
    chat_prompt_with_values = chat_prompt.format_prompt(
        text=my_input[0],
        character=my_input[1]
        , format_instructions=parser.get_format_instructions()
    )
    output = llm(chat_prompt_with_values.to_messages())
    text = parser.parse(output.content)
    # output organisé

    return text.overall


@app.post('/chat')
async def summarize_text(summary: Summary):
    result = prompting(summary,150)
    return {'summary': result}