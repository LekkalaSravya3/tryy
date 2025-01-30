

cmake_minimum_required(VERSION 3.10)
project(TestOps)
enable_testing()
set(GTEST_ROOT "../tests/googletest")

set(Torch_DIR "/home/sravya/libtorch/share/cmake/Torch")
list(APPEND CMAKE_PREFIX_PATH "/home/sravya/libtorch/cmake/Torch")

find_package(Torch REQUIRED)
find_package(GTest REQUIRED)
find_package(Python3 REQUIRED COMPONENTS Development)

add_subdirectory(../tests/googletest googletest-build)


add_executable(test_ops test_minimum.cpp)

target_link_libraries(test_ops ${TORCH_LIBRARIES} gtest gtest_main pthread ${Python3_LIBRARIES} )

target_sources(test_ops PRIVATE ../tests/googletest/googletest/src/gtest-all.cc)
target_include_directories(test_ops PRIVATE ${GTEST_INCLUDE_DIRS} ${Python3_INCLUDE_DIRS})


set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} ${TORCH_CXX_FLAGS}")

add_test(NAME OpsTest COMMAND test_ops)





