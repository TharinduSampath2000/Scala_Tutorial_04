def interest_rate_select(amount: Int): Double = amount match{
    case x if(amount <= 20000) => 0.02;
    case x if(amount <= 200000) => 0.035;
    case x if(amount <= 2000000) => 0.04;
    case _ => 0.065;
}

def interest_per_year(amount: Int): Double = {
    return amount * interest_rate_select(amount);
}

def main(args:Array[String])={
    print("Enter deposit amount: ");
    var amount = scala.io.StdIn.readInt();
    println("Total interest in a year: "+ interest_per_year(amount));
}