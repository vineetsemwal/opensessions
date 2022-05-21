function add(num1, num2) {
    let promise=new Promise(
        (resolve,reject)=>{
            if(!num1 || !num2){
                reject(new Error("num1 or num2 is undefined"));
            }
            let result=num1+num2;
            resolve(result);
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
