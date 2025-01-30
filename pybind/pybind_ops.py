import torch
import torch.nn as nn
import sys 
sys.path.append('/mnt/c/Users/lekka/OneDrive/Desktop/pytorch-Assignments/Assignment-2/pybind/build')
print(sys.path)
import custom
class DecompOpsModule(nn.Module):
    def __init__(self):
        super().__init__()
    def custom_fun(self,tensor1,tensor2):
        return custom.custom_minimum(tensor1,tensor2)
    def forward(self,tensor1,tensor2):
        return self.custom_fun(tensor1,tensor2)
class TorchopsModule(nn.Module):
    def __init__(self):
        super().__init__()
    def torch_fun(self,tensor1,tensor2):
        return custom.torch_minimum(tensor1,tensor2)
    def forward(self,tensor1,tensor2):
        return self.torch_fun(tensor1,tensor2)

