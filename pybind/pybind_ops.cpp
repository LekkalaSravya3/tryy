
#include <pybind11/pybind11.h>
#include <torch/extension.h>

#include "../src/custom_minimum.h"
// #include <torch/extension.h>

namespace py = pybind11;


PYBIND11_MODULE(custom, m) {
     m.def("custom_minimum", &custom_minimum);
    m.def("torch_minimum", &torch_minimum);
}
