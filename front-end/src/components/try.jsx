import React from 'react'
import axios from 'axios'
import { useState, useEffect } from 'react'

   
export default function Order() {

    const [Id, setId] = useState("");
    const [customerId, setcustomerId] = useState("");
    const [restaurantId, setrestaurantId] = useState("");
    const [order, setOrder] = useState({})

    const handleSubmit = async (e) => {
        e.preventDefault();
        setMessage("Order created successfully")
        try {
            const { data } = await axios.get(
              "https://jsonplaceholder.typicode.com/Orders/1"
            ).finally(() => {
                setId("");
                setcustomerId("");
                setrestaurantId("");
                
            });
            setOrder(data)
        } catch (err) {
            console.log(err);
        }
    };

    const resetForm = (e) => {
        e.preventDefault();

        setId("");
        setcustomerId("");
    }


  return (
    <div>
    <form>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Id</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">customerId</label>
    <input  class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">restaurantId</label>
    <input  class="form-control" id="exampleInputPassword1"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </div>
  )
}
