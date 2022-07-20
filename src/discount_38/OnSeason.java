package discount_38;

public class OnSeason 
{
static double discount;
static double pay_amount=0;

public void discount(double amount) 
{
	discount=amount*0.4;
	pay_amount=(amount-discount);
}

}
