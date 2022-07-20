package ATM_39;

public class Bank 
{
private static int pin[]= {1001,1234,1212};
int count=0;
public boolean ValidatePin(int pint)
{
	for(int i=0;i<=pin.length-1;i++)
	{
	if(pin[i]==pint)
		count++;
	
	}
	if(count>0)
		return true;
	else
		return false;
	
}


}
