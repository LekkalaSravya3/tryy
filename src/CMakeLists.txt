cmake_minimum_required(VERSION 3.14)
 
project(cusmin)
 

set(Torch_DIR "/home/sravya/libtorch/share/cmake/Torch")
list(APPEND CMAKE_PREFIX_PATH "/home/sravya/libtorch/cmake/Torch")
add_compile_definitions(_GLIBCXX_USE_CXX11_ABI=0)

include_directories(${CMAKE_CURRENT_SOURCE_DIR})
find_package(Torch REQUIRED)

add_executable(ops custom_minimum.cpp)
target_link_libraries(ops ${TORCH_LIBRARIES} )

set_property(TARGET ops PROPERTY CXX_STANDARD 17)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} ${TORCH_CXX_FLAGS}")



