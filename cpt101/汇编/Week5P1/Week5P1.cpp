// CPT101 Handling Character.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
	char scanf_fmt[] = "%c";
	char printf_fmt[] = "%c\n";
	char character;

	_asm {
		push	1							// Buffer size, you can also write `push size character`
		lea		eax, character
		push	eax							// Pointer to character
		lea		eax, scanf_fmt                 //将mov改为lea
		push	eax							// Pointer to format string
		call	scanf_s
		add		esp, 12						// Clean up three pushes

		movzx	eax, byte ptr[character]	// MOVZX: Load one unsigned byte into a 32-bit-register
		push	eax							// Character as value
		lea		eax, printf_fmt               //将mov改为lea
		push	eax							// Pointer to format string
		call	printf
		add		esp, 8						// Clean up two pushes
	}
	return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file