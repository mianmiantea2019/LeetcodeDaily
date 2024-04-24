#include <iostream>

void removeEven(int arr[], int& size) {
  int oddIndex = 0;
  for (int i = 0;  i <size; i++) {
    arr[oddIndex] = arr[i];
    oddIndex++;
  }
  size = oddIndex;
}

int main() {
  int arr[] = {1,2,3,4,5,6,7,8};
  int size = sizeof(arr)/sizeof(arr[0]);

  for (int i = 0; i < size; i++) {
    std::cout << arr[i] << " ";
  }

  removeEven(arr, size);

  std::cout << "Array after removing even integers: ";
  for (int i = 0; i < size; i++) {
      std::cout << arr[i] << " ";
  }
  std::cout << std::endl;
  return 0;
}
  
