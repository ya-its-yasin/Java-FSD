package cpm.tcs.oops.access2;

import com.tcs.oops.access.SamePackageSameClass;

public class DifferentPackageNonSubClass {

	public void testC(String as[])
	{
		SamePackageSameClass a1 = new SamePackageSameClass();
		System.out.println(/*a1.a + a1.b + a1.c + */a1.d);
	}
	
}
