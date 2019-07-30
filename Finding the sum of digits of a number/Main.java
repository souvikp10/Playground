#include <stdio.h>
int main()
{
	int i,n,digit,sum=0;
  scanf("%d",&n);
  if(n>0)
  { 
  		for(i=0;i<=n;i++)
        {
          digit=n%10;
          sum=sum+digit;
          n=n/10;
        }
  }
  printf("%d",sum);
	return 0;
}