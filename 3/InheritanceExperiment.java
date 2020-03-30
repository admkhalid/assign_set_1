class Parent
{
	private Parent()
	{
		System.out.println("default parent");
    }
    Parent(int a) {this();}
}

// Java(134217872)
// If there is no explicit call for a super constructor, Java calls the no-parameter super construtor
// Should always explixitly call a super constructor

class Child extends Parent
{
    Child(){super(1);}
}

class InheritanceExperiment {
    public static void main(String[] args) {
        Child c = new Child();
    }
}