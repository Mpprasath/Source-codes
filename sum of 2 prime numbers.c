#include <stdio.h>
void fn(int n){
    int f=0;
    if(n==0||n==1){
        printf("no");
    }
    if(n%2==0){
        printf("yes");
    }else{
        int m=n-2;
        for(int i=2;i<=m/2;i++){
            if(m%i==0) f=1;
        }
        if(f==1) printf("no");
        else printf("yes");
    }
}

int main()
{
  int n;
  scanf("%d",&n);
  fn(n);
}
