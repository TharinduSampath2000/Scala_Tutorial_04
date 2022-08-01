def odd_even_negative_zero(number: Int): Unit = number match{
    case x if(x > 0 && x % 2 == 0) => println("Even number");
    case x if(x > 0 && x % 2 != 0) => println("Odd number");
    case _ => println("Negative/Zero"); 
}


def main(args:Array[String])={ 
    print("Enter a number: ");
    var number = scala.io.StdIn.readInt();

    odd_even_negative_zero(number);
}