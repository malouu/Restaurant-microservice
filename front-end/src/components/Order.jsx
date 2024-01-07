import React, { useState, useEffect } from "react";
import axios from "axios";

const GetData = () => {
// State to store the form data
const [formData, setFormData] = useState({
    id: "",
    customerId: "",
    restaurantId: "",
  });

  // Function to handle form input changes
  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  // Function to submit the form data using Axios
  const handleSubmit = async (e) => {
    e.preventDefault();
    
    try {
        
      const response = await axios.post("https://b5b4-196-234-242-78.ngrok-free.app/api/v1/orders", formData);
      console.log("Post created:", response.data);
    } catch (error) {
      console.error("Error creating post:", error);
    }
  };
  
  
  const data = { username: "example" };
  postJSON(data);
  

  // State to store the fetched data
  const [data, setData] = useState([]);

  // Function to fetch data using Axios
  const fetchData = async () => {
    try {
      const response = await axios.get("https://b5b4-196-234-242-78.ngrok-free.app/api/v1/orders");
      setData(response.data);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  // Call fetchData on component mount
  useEffect(() => {
    fetchData();
  }, []);

  return (
    <div>
         <form onSubmit={handleSubmit}>
      <label>
        ID:
        <input name="id" value={formData.id} onChange={handleChange} />
      </label>
      <br />
      <label>
        Customer ID:
        <input name="customerId" value={formData.customerId} onChange={handleChange}></input>
      </label>
      <br />
      <label>
        restaurent ID:
        <input name="restaurantId" value={formData.restaurantId} onChange={handleChange}></input>
      </label>
      <br />
      <button type="submit">Add Post</button>
    </form>
      <h2>Orders:</h2>
      <ul>
        {data.map((Order) => (
          <li key={Order.id}>{Order.state}{Order.customerId}{Order.restaurantId}</li>
        ))}
      </ul>
    </div>
  );
};

export default GetData;