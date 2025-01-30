#include<iostream>
#include <gtest/gtest.h>
#include <torch/torch.h>
#include "../src/custom_minimum.h"

class CustomOpsTests : public ::testing::TestWithParam<std::pair<torch::Tensor,torch::Tensor>>{
    public:
    torch::Tensor tensor1,tensor2;
    void SetUp(){
        tensor1 =GetParam().first;
        tensor2 =GetParam().second;

    }

};

TEST_P(CustomOpsTests,customminimum){
 
    ASSERT_TRUE((torch::equal(custom_minimum(tensor1,tensor2),torch_minimum(tensor1,tensor2))));
    // ASSERT_TRUE(9==9);
}
INSTANTIATE_TEST_SUITE_P(
    CustomOpsTests, 
    CustomOpsTests,  
    ::testing::Values(  
        std::make_pair(torch::tensor({1, 2, 3}), torch::tensor({5, 2, 1})),
        std::make_pair(torch::tensor({-1, -5, -3}), torch::tensor({-2, -4, -3})),
        std::make_pair(torch::tensor({{10, 20, 30},{2,3,6}}), torch::tensor({{5, 25, 35},{2,30,4}}))
    )
);


int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}

