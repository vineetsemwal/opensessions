function add(num1, num2) {
    if (!num1 || !num2) {
        let err = new Error("num1 or num2 is not defined");
        let promise = Promise.reject(err);
        return promise;
    }
    let result = num1 + num2;
    let promise = Promise.resolve(result);
    return promise;
}

function useAdd() {
    let promise = add(2, undefined);
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
