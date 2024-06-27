#include <iostream>
#include <ctime>
using namespace std;

int main(){ // A PRINCIPIO ULTIMA VEZ ULTILIZADA SERA NA CRIAÇAO DPS NA ATRIBUIÇAO
	time_t timer;
	timer = time(NULL);
	cout << timer << endl;
	return 0;
}