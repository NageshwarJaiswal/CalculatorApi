package QualityKioskTraining.CalculatorDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class AdditionTestCase {
	
	


		CalculatorApi obj;
		
		@BeforeGroups("RegressionTest")
		@BeforeClass
		public void init() {
			obj=new CalculatorApi();  
		}
		public void Reinitialisevar()
		{
			System.out.print("I am in method");
			int Result=0;
		}
		@Test(priority=1,groups= {"RegressionTest"} )
		public void TestAdditionWithPositiveNumber(){
			
			int Result=obj.Addition(10,20);
			Assert.assertEquals(Result,30,"Addition");
		}
		@Test(priority=3)
		public void TestAdditionWithZeroNumber() {
			
			int Result=obj.Addition(0, 0);
			Assert.assertEquals(Result, 0,"notZero");
			
		}
		@Test(priority=2, groups= {"RegressionTest"} )
		public void AdditionWithOnePositiveOneNegative() {
			
			int Result=obj.Addition(10,-8);
			Assert.assertEquals(Result, 2,"poss");
		}

	}



