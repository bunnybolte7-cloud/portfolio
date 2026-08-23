#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void process_string(char *input) {
    // 1. Potential Buffer Overflow
    char buffer[10];
    strcpy(buffer, input); 
    printf("Buffer content: %s\n", buffer);
}

int main() {
    // 2. Memory Leak
    int *numbers = (int *)malloc(5 * sizeof(int));
    for (int i = 0; i < 5; i++) {
        numbers[i] = i * 10;
    }
    // numbers is never freed

    // 3. Out-of-Bounds Array Access (Off-by-one error)
    int scores[3] = {90, 85, 95};
    for (int i = 0; i <= 3; i++) { 
        printf("Score %d: %d\n", i, scores[i]);
    }

    // 4. Use of Uninitialized Variable
    int uninitialized_var;
    printf("Uninitialized value: %d\n", uninitialized_var);

    // 5. Null Pointer Dereference
    int *ptr = NULL;
    *ptr = 100; 

    process_string("This string is way too long for the buffer");

    return 0;
}
