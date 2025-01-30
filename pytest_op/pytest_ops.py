import torch
import pytest 
from pybind.pybind_ops import DecompOpsModule,TorchopsModule
cus_op = DecompOpsModule()
tor_op = TorchopsModule()
@pytest.mark.parametrize(
    "tensor1, tensor2",
    [
        (torch.tensor([0,3]), torch.tensor([2,1])),
        (torch.tensor([4, 5]), torch.tensor([1, 0])),
        (torch.tensor([[4, 5],[2,3]]), torch.tensor([[-1, 0],[2,3]])), 
        (torch.tensor([[[4, 5],[4,3]],[[4, 3],[4,5]]]), torch.tensor([[[1, 0],[4,3]],[[1, 0],[4,3]]])),
    ],
)

def test_op(tensor1,tensor2):
    assert torch.equal(cus_op.forward(tensor1,tensor2),tor_op(tensor1,tensor2))
