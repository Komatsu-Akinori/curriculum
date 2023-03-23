let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
let num = numbers.filter(x => x % 2 == 0);

function isEven() {
    console.log(num + 'は偶数です');
}

isEven();


class Car{
  constructor(car_gasoline, car_number){
    this.car_gasoline = car_gasoline;
    this.car_number = car_number
  }

  getNumGas(){
    console.log('ガソリンは'+ this.car_gasoline +'です。ナンバーは'+ this.car_number +'です。');
  }
  
}

let car_inf = new Car('〇〇', '△△');
car_inf.getNumGas();

