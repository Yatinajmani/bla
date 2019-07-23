#include <fstream>
#include <iostream>
using namespace std;
class student
{
    int iregno;
    char cname[30];
  public:
    void setregno()
    {
      cout<<"\nEnter reg no. :";
      cin>>iregno;
    }
    void setname()
    {
      cout<<"\nEnter name :";
      cin>>cname;
    }
    int getregno()
    {
      return iregno;
    }
    char* getname()
    {
      return cname;
    }
};

int main()
{
  ofstream sfil("studfile.txt");
  char ch;
  student svar;
  svar.setregno();
  svar.setname();
  sfil<<svar.getregno()<<" "<<svar.getname();
  sfil.close();
 /* cout<<"\nDo u want to read file y/n :";
  cin>>ch;
  if(ch=='y')
  {
    ifstream sfil("studfile.txt");
    int ireg;
    char nam[20];
    sfil>>ireg>>nam;
    cout<<"\n\nReg no is    : "<<ireg;
    cout<<"\nStud name is : "<<nam;
  }
  */
return 0;
}
