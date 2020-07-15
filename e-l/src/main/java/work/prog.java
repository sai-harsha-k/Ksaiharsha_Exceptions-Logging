package work;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class prog 
{
	private static final Logger LOGGER=LogManager.getLogger(prog.class);
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc = new  Scanner(System.in);
    	Double PrincipalAmount;
    	Double Time;
    	Double Rate;
    	LOGGER.debug("Enter PrincipalAmount\n");
    	PrincipalAmount=sc.nextDouble();
    	LOGGER.info("Enter Time\n");
    	Time=sc.nextDouble();
        LOGGER.info("Enter Rate\n");
    	Rate=sc.nextDouble();
    	Double SimpleInterest;
    	SimpleInterest=((PrincipalAmount*Time*Rate)/100);
        LOGGER.info("Simple Interest is "+SimpleInterest);
    	LOGGER.info("\n");
    	Double CompoundInterest;
    	CompoundInterest=PrincipalAmount*(Math.pow((1+Rate/100),Time));
    	LOGGER.info("CompoundInterst is "+CompoundInterest);
    	System.exit(0);
    	}
    }