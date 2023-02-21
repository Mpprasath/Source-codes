#include <stdio.h>
#include <string.h>

int main() {
  char color[5] = "green";
  char *result = color+1; // removes first character
  result[strlen(result)-1] = '\0'; // removes last character

  printf("%s\n",result);
}
