#include <iostream>
#include <vector>
#include <string>
using namespace std;


class Person {
 public:
  ostream& operator<< (ostream& out);
  friend ostream& operator<< (ostream& out, const Person &person);
  int ID;
  string name;
};

ostream& Person::operator<< (ostream& out) {
  out << "Name= " << name << endl;
  return out;
}

/* friend */ ostream& operator<< (ostream& out, const Person &person) {
  out << "Name= " << person.name << endl;
  return out;
}

int main() {

  Person person;
  person.name = "Season";

  person << cout;

  cout << person;

  return 0;
}

/*##########################################

Seasons-MacBook-Pro:err Sky$ ./a.out
Name= Season
Name= Season
Seasons-MacBook-Pro:err Sky$

##########################################*/