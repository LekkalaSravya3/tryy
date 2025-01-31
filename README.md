# Assignment-2

Decompose PyTorch operations using only the supported operations in C++ API, and develop comprehensive Gtest cases to validate the decomposed operations, ensuring all edge cases are covered. Then extend your custom c++ ops to python using pybind11 and write pytest to validate the same. The implementation should be thoroughly documented, with well-structured and maintainable code.

torch.minimum op using only torch.maximum, torch.multiply, torch.ones

torch.special.entr without using torch.where [optional if you have time]

Useful Docs:
Custom C++ and CUDA Extensions — PyTorch Tutorials 2.5.0+cu124 documentation

Note:

Create a new branch "assignment-2"

Setup working environment. 

First install libtorch c++ library with CMake configured.
Install GTest

Decompose torch ops in C++ using libtorch APIs.

Write GTest unit tests to verify the decomposition.

Now install Pybind and bind C++ calls to python calls
Test with Pytest.
## Installation


#### Clone the repository
`https://github.com/your-repo-name/pytorch_assignments.git`

cd pytorch_assignments

git checkout assignment-2
#### Install required dependencies:
a) Install LibTorch:

Use Wsl for installing the LibTorch

Do as per the steps in this document

`https://pytorch.org/cppdocs/installing.html#minimal-example` 

Use the provided CMakeLists.txt to configure and build your project

b) Install Google Test (GTest):

    sudo apt-get install libgtest-dev


#### Setup Python virtual environment for Pybind:

    mkdir -p ~/miniconda3
    wget https://repo.anaconda.com/miniconda/Miniconda3-latest-Linux-x86_64.sh -O ~/miniconda3/miniconda.sh
    bash ~/miniconda3/miniconda.sh -b -u -p ~/miniconda3
    rm ~/miniconda3/miniconda.sh

    source ~/miniconda3/bin/activate

    conda init --all
 
In Directory create conda 

    conda create -n envname -c conda-forge git python=3.10
    conda activate envname 

    pip install pybind11
    pip install torch

pytest
 
    pip install pytest 

## Running and Testing 

1.src - contains the main implementation of the decomposition 
    
    cd src
    mkdir build
    cd build
    cmake ..
    make
    ./ops

2.gtest_op - testing 

    cd gtest_op
    mkdir build
    cd build
    cmake ..
    make 
    ./test_ops

3.pybind

    cd pybind
    mkdir build
    cd build
    cmake ..
    make

4.pytest

    cd pytest 

    pytest test_logaddexp.py

    pytest test_opaddbmm.py




    







