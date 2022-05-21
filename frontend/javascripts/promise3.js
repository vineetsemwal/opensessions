function add(num1, num2) {
    let promise=new Promise(
        (resolve,reject)=>{
            if(!num1 || !num2){
                reject(new Error("num1 or num2 is undefined"));
            }
            setTimeout(()=>{
                let result=num1+num2;
                console.log("about to publish result");
                resolve(result);
            }, 5000);
           
        }
    );
    return promise;
}

function useAdd() {
    let promise = add(3,4);
    let successHandler = result => {
        console.log("consuming result");
        console.log("result is ", result);
    }
    let errHandler = err => {
        console.log("error is ", err);
    };
    promise.then(successHandler, errHandler);
    console.log("bye");
}


useAdd();
