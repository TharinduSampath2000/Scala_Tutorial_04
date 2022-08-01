def toUpper(input: String): String = {
    input.toUpperCase();
}

def toLower(input: String): String = {
    input.toLowerCase();
}

def formatNames(input: String, function:(String) => String): String = {
    function(input);
}

def main(args:Array[String])={ 
    println(formatNames("Benny", toUpper));
    println(formatNames("Ni", toUpper) + "roshan");
    println(formatNames("Saman", toLower));
    println(formatNames("K", toUpper) +"umar" + formatNames("a", toUpper));
}