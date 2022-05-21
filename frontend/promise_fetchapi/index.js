import fetch from "node-fetch";

function fetchAll(){
    let url="http://localhost:3000/employees" 
    let promise=fetch(url);// fetch method gives me promise of response
    promise.then(response=>{
       let resultPromise= response.json();//gives me promise of result
       
       //success handler subscribed for result, when result will be available, it will be executed
       resultPromise.then(employees=>{
           for(let emp of employees){
               console.log("employee is ", emp);
           }
       });
    });
}


fetchAll();
console.log("bye");

