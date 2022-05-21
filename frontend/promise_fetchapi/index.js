import fetch from "node-fetch";
/**
 * fetches all employees from server
 */
function fetchAll() {
    let url = "http://localhost:3000/employees";
    let responsePromise = fetch(url);// fetch method gives me promise of response
    responsePromise.then(response => {
        let resultPromise = response.json();//gives me promise of result

        //success handler subscribed for result, when result will be available, it will be executed
        resultPromise.then(employees => {
            for (let emp of employees) {
                console.log("employee is ", emp);
            }
        });
    });
}

/**
 * adds an employee int the server
 */
function addEmployee() {
    let url = "http://localhost:3000/employees";
    let requestData = {
        "name": "ayush",
        "age": 23
    };
    let requestDataText = JSON.stringify(requestData);

    let requestInfo =
    {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },

        body: requestDataText
    };


    let responsePromise = fetch(url, requestInfo);
    responsePromise.then(response => {
        let promiseResult = response.json();
        promiseResult.then(employee => {
            console.log("employee added", employee);
        });
    });

}


/**
 * updates an employee with id 4 in  the server
 */
 function updateEmployee() {
    const id=4; 
    const url = "http://localhost:3000/employees/"+id;
    const requestData = {
        "name": "ayush sharma",
        "age": 24
    };
    let requestDataText = JSON.stringify(requestData);

    let requestInfo =
    {
        method: "PUT",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },

        body: requestDataText
    };


    let responsePromise = fetch(url, requestInfo);
    responsePromise.then(response => {
        let promiseResult = response.json();
        promiseResult.then(employee => {
            console.log("employee updated", employee);
        });
    });

}

/**
 * delete employee with id 4
 */
function deleteEmployee(){
    const id=4; 
    const url = "http://localhost:3000/employees/"+id;
    
    let requestInfo =    {  method: "DELETE"  };


    let responsePromise = fetch(url, requestInfo);
    responsePromise.then(response => {
        console.log("employee deleted with id "+id);
    });

}


//addEmployee();
fetchAll();
//updateEmployee();
//deleteEmployee();
console.log("bye");

