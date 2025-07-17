class HelloWorld{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}  

class Sum{
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 8;
        if (num1 + num2 == 11) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect!");
        }
    }
}

class makeSomethingInteresting{
    private void main() {
        boolean TruthValue = false;
        double Pi = 3.141592653589;
        char FirstLetter = 'A';
        short MonetaryWealth = -32768;

        if TruthValue is false {
            System.out.println('Here we go again.');
        } else {
            System.out.println('Here wo dont go again.');
        }
    }
}


//assertion keyword explained. The assert keyword evaluates a boolean expression and throws an AssertionError exception if the expression evaluates to false.
public class Main {
  public static void main(String[] args) {
    // Enable assertions
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    loader.setDefaultAssertionStatus(true);
    
    // Run the assert example
    AssertExample example = new AssertExample();
    example.run();
  }
}

class AssertExample {
  public void run() {
    int a = 12;
    try {
      assert a == 12; // Assertion without a fail message
      assert a == 12 : "a is not 12";
      assert a == 15 : "a is not 15";
    } catch (AssertionError e) {
      System.out.println(e.getMessage());
    }
  }
}

//Keywords:
//abstract	continue	for	new	switch
//	default	goto*	package	synchronized
//	do		private	this
//break		implements	protected	throw
//	else	import	public	throws
//case	enum****	instanceof		transient
//	extends			try
//	final	interface	static	void
//	finally	long	strictfp**	volatile
//const*		native	super	while///
