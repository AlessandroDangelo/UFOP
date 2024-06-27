
//const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const inputArray = document.getElementById("arrayInput").value.split(',').map(Number);

function isPrime(num) {
    if (num <= 1) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
      if (num % i === 0) return false;
    }
    return true;
}
//---------------------------------------------------------------------------------


function doubleArrayValues(inputArray) {
    const doubledArray = [];
    inputArray.forEach(function (value) {
      doubledArray.push(value * 2);
    });
    return doubledArray;
}

//---------------------------------------------------------------------------------

function isPrime(num) {
    if (num <= 1) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

function runFunctions() {
    // Obter o valor do campo de entrada e converter para um array de números
    const inputArray = document.getElementById("arrayInput").value.split(',').map(Number);
  
    // Verificar se todos os elementos são primos
    const areAllPrimes = inputArray.every(isPrime);
    document.getElementById("areAllPrimesResult").innerText = "Todos os elementos são primos? " + areAllPrimes;
  
    // Calcular o dobro dos valores
    const doubledArray = doubleArrayValues(inputArray);
    document.getElementById("doubledArrayResult").innerText = "Dobro dos valores: " + doubledArray;
  
    // Filtrar apenas os valores primos
    const primeArray = inputArray.filter(isPrime);
    document.getElementById("primeArrayResult").innerText = "Array com apenas valores primos: " + primeArray;
  }