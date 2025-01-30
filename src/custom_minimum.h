#ifndef CUSTOM_MINIMUM_H
#define CUSTOM_MINIMUM_H
#pragma once
#include <torch/torch.h>
#include<iostream>
using namespace std;
 at::Tensor custom_minimum(const at::Tensor& tensor1,const at::Tensor& tensor2){
  at::Tensor a =at::multiply(tensor1,-1);
  at::Tensor b =at::multiply(tensor2,-1);
 at::Tensor min_value =at::maximum(a,b);
  return at::multiply(min_value,-1);
};

 at::Tensor torch_minimum(const at::Tensor& tensor1,const at::Tensor& tensor2){
  return at::minimum(tensor1,tensor2);
};
//  int main() {
//   torch::Tensor tensor1 = torch::tensor({1,2,3});
//   torch::Tensor tensor2 = torch::tensor({5,2,1});
//   cout << custom_minimum(tensor1,tensor2)<< endl;
//   cout << torch_minimum(tensor1,tensor2);
//   return 0;
// }
#endif