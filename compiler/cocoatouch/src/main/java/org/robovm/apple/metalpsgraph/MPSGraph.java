/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metalpsgraph;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraph/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphPtr extends Ptr<MPSGraph, MPSGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraph() {}
    protected MPSGraph(Handle h, long handle) { super(h, handle); }
    protected MPSGraph(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "options")
    public native MPSGraphOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(MPSGraphOptions v);
    @Property(selector = "placeholderTensors")
    public native NSArray<MPSGraphTensor> getPlaceholderTensors();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "compileWithDevice:feeds:targetTensors:targetOperations:compilationDescriptor:")
    public native MPSGraphExecutable compile(MPSGraphDevice device, NSDictionary<MPSGraphTensor, MPSGraphShapedType> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations, MPSGraphCompilationDescriptor compilationDescriptor);
    @Method(selector = "runWithFeeds:targetTensors:targetOperations:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensorData> run(NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations);
    @Method(selector = "runWithMTLCommandQueue:feeds:targetTensors:targetOperations:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensorData> run(MTLCommandQueue commandQueue, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations);
    @Method(selector = "runWithMTLCommandQueue:feeds:targetOperations:resultsDictionary:")
    public native void run(MTLCommandQueue commandQueue, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphOperation> targetOperations, NSDictionary<MPSGraphTensor, MPSGraphTensorData> resultsDictionary);
    @Method(selector = "runAsyncWithFeeds:targetTensors:targetOperations:executionDescriptor:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensorData> runAsync(NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations, MPSGraphExecutionDescriptor executionDescriptor);
    @Method(selector = "runAsyncWithMTLCommandQueue:feeds:targetTensors:targetOperations:executionDescriptor:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensorData> runAsync(MTLCommandQueue commandQueue, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations, MPSGraphExecutionDescriptor executionDescriptor);
    @Method(selector = "runAsyncWithMTLCommandQueue:feeds:targetOperations:resultsDictionary:executionDescriptor:")
    public native void runAsync(MTLCommandQueue commandQueue, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphOperation> targetOperations, NSDictionary<MPSGraphTensor, MPSGraphTensorData> resultsDictionary, MPSGraphExecutionDescriptor executionDescriptor);
    @Method(selector = "encodeToCommandBuffer:feeds:targetTensors:targetOperations:executionDescriptor:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensorData> encodeToCommandBuffer(MPSCommandBuffer commandBuffer, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphTensor> targetTensors, NSArray<MPSGraphOperation> targetOperations, MPSGraphExecutionDescriptor executionDescriptor);
    @Method(selector = "encodeToCommandBuffer:feeds:targetOperations:resultsDictionary:executionDescriptor:")
    public native void encodeToCommandBuffer(MPSCommandBuffer commandBuffer, NSDictionary<MPSGraphTensor, MPSGraphTensorData> feeds, NSArray<MPSGraphOperation> targetOperations, NSDictionary<MPSGraphTensor, MPSGraphTensorData> resultsDictionary, MPSGraphExecutionDescriptor executionDescriptor);
    @Method(selector = "gradientForPrimaryTensor:withTensors:name:")
    public native NSDictionary<MPSGraphTensor, MPSGraphTensor> gradientForPrimaryTensor(MPSGraphTensor primaryTensor, NSArray<MPSGraphTensor> tensors, String name);
    @Method(selector = "reLUWithTensor:name:")
    public native MPSGraphTensor reLU(MPSGraphTensor tensor, String name);
    @Method(selector = "reLUGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor reLUGradient(MPSGraphTensor gradient, MPSGraphTensor source, String name);
    @Method(selector = "sigmoidWithTensor:name:")
    public native MPSGraphTensor sigmoid(MPSGraphTensor tensor, String name);
    @Method(selector = "sigmoidGradientWithIncomingGradient:sourceTensor:name:")
    public native MPSGraphTensor sigmoidGradient(MPSGraphTensor gradient, MPSGraphTensor source, String name);
    @Method(selector = "softMaxWithTensor:axis:name:")
    public native MPSGraphTensor softMax(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "softMaxGradientWithIncomingGradient:sourceTensor:axis:name:")
    public native MPSGraphTensor softMaxGradient(MPSGraphTensor gradient, MPSGraphTensor source, @MachineSizedSInt long axis, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "leakyReLUWithTensor:alpha:name:")
    public native MPSGraphTensor leakyReLU(MPSGraphTensor tensor, double alpha, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "leakyReLUWithTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLU(MPSGraphTensor tensor, MPSGraphTensor alphaTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "leakyReLUGradientWithIncomingGradient:sourceTensor:alphaTensor:name:")
    public native MPSGraphTensor leakyReLU(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphTensor alphaTensor, String name);
    @Method(selector = "identityWithTensor:name:")
    public native MPSGraphTensor identity(MPSGraphTensor tensor, String name);
    @Method(selector = "exponentWithTensor:name:")
    public native MPSGraphTensor exponent(MPSGraphTensor tensor, String name);
    @Method(selector = "exponentBase2WithTensor:name:")
    public native MPSGraphTensor exponentBase2(MPSGraphTensor tensor, String name);
    @Method(selector = "exponentBase10WithTensor:name:")
    public native MPSGraphTensor exponentBase10(MPSGraphTensor tensor, String name);
    @Method(selector = "logarithmWithTensor:name:")
    public native MPSGraphTensor logarithm(MPSGraphTensor tensor, String name);
    @Method(selector = "logarithmBase2WithTensor:name:")
    public native MPSGraphTensor logarithmBase2(MPSGraphTensor tensor, String name);
    @Method(selector = "logarithmBase10WithTensor:name:")
    public native MPSGraphTensor logarithmBase10(MPSGraphTensor tensor, String name);
    @Method(selector = "squareWithTensor:name:")
    public native MPSGraphTensor square(MPSGraphTensor tensor, String name);
    @Method(selector = "squareRootWithTensor:name:")
    public native MPSGraphTensor squareRoot(MPSGraphTensor tensor, String name);
    @Method(selector = "reverseSquareRootWithTensor:name:")
    public native MPSGraphTensor reverseSquareRoot(MPSGraphTensor tensor, String name);
    @Method(selector = "reciprocalWithTensor:name:")
    public native MPSGraphTensor reciprocal(MPSGraphTensor tensor, String name);
    @Method(selector = "absoluteWithTensor:name:")
    public native MPSGraphTensor absolute(MPSGraphTensor tensor, String name);
    @Method(selector = "negativeWithTensor:name:")
    public native MPSGraphTensor negative(MPSGraphTensor tensor, String name);
    @Method(selector = "signWithTensor:name:")
    public native MPSGraphTensor sign(MPSGraphTensor tensor, String name);
    @Method(selector = "signbitWithTensor:name:")
    public native MPSGraphTensor signbit(MPSGraphTensor tensor, String name);
    @Method(selector = "ceilWithTensor:name:")
    public native MPSGraphTensor ceil(MPSGraphTensor tensor, String name);
    @Method(selector = "floorWithTensor:name:")
    public native MPSGraphTensor floor(MPSGraphTensor tensor, String name);
    @Method(selector = "roundWithTensor:name:")
    public native MPSGraphTensor round(MPSGraphTensor tensor, String name);
    @Method(selector = "rintWithTensor:name:")
    public native MPSGraphTensor rint(MPSGraphTensor tensor, String name);
    @Method(selector = "sinWithTensor:name:")
    public native MPSGraphTensor sin(MPSGraphTensor tensor, String name);
    @Method(selector = "cosWithTensor:name:")
    public native MPSGraphTensor cos(MPSGraphTensor tensor, String name);
    @Method(selector = "tanWithTensor:name:")
    public native MPSGraphTensor tan(MPSGraphTensor tensor, String name);
    @Method(selector = "sinhWithTensor:name:")
    public native MPSGraphTensor sinh(MPSGraphTensor tensor, String name);
    @Method(selector = "coshWithTensor:name:")
    public native MPSGraphTensor cosh(MPSGraphTensor tensor, String name);
    @Method(selector = "tanhWithTensor:name:")
    public native MPSGraphTensor tanh(MPSGraphTensor tensor, String name);
    @Method(selector = "asinWithTensor:name:")
    public native MPSGraphTensor asin(MPSGraphTensor tensor, String name);
    @Method(selector = "acosWithTensor:name:")
    public native MPSGraphTensor acos(MPSGraphTensor tensor, String name);
    @Method(selector = "atanWithTensor:name:")
    public native MPSGraphTensor atan(MPSGraphTensor tensor, String name);
    @Method(selector = "asinhWithTensor:name:")
    public native MPSGraphTensor asinh(MPSGraphTensor tensor, String name);
    @Method(selector = "acoshWithTensor:name:")
    public native MPSGraphTensor acosh(MPSGraphTensor tensor, String name);
    @Method(selector = "atanhWithTensor:name:")
    public native MPSGraphTensor atanh(MPSGraphTensor tensor, String name);
    @Method(selector = "notWithTensor:name:")
    public native MPSGraphTensor not(MPSGraphTensor tensor, String name);
    @Method(selector = "isInfiniteWithTensor:name:")
    public native MPSGraphTensor isInfinite(MPSGraphTensor tensor, String name);
    @Method(selector = "isFiniteWithTensor:name:")
    public native MPSGraphTensor isFinite(MPSGraphTensor tensor, String name);
    @Method(selector = "isNaNWithTensor:name:")
    public native MPSGraphTensor isNaN(MPSGraphTensor tensor, String name);
    @Method(selector = "erfWithTensor:name:")
    public native MPSGraphTensor erf(MPSGraphTensor tensor, String name);
    @Method(selector = "additionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor addition(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "subtractionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor subtraction(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "multiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor multiplication(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "divisionWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor division(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "moduloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor modulo(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "powerWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor power(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "minimumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimum(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "maximumWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximum(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "minimumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor minimumWithNaNPropagation(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "maximumWithNaNPropagationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor maximumWithNaNPropagation(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "equalWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor equal(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "notEqualWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor notEqual(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "lessThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThan(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "lessThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor lessThanOrEqual(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "greaterThanWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThan(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "greaterThanOrEqualToWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor greaterThanOrEqual(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalAND(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalOR(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalNANDWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNAND(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalNOR(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalXORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXOR(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "logicalXNORWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor logicalXNOR(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "atan2WithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor atan2(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "selectWithPredicateTensor:truePredicateTensor:falsePredicateTensor:name:")
    public native MPSGraphTensor select(MPSGraphTensor predicateTensor, MPSGraphTensor truePredicateTensor, MPSGraphTensor falseSelectTensor, String name);
    @Method(selector = "clampWithTensor:minValueTensor:maxValueTensor:name:")
    public native MPSGraphTensor clamp(MPSGraphTensor tensor, MPSGraphTensor minValueTensor, MPSGraphTensor maxValueTensor, String name);
    @Method(selector = "divisionNoNaNWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor divisionNoNaN(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "floorModuloWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor floorModulo(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    @Method(selector = "convolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor convolution2D(MPSGraphTensor source, MPSGraphTensor weights, MPSGraphConvolution2DOpDescriptor descriptor, String name);
    @Method(selector = "convolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DDataGradient(MPSGraphTensor incomingGradient, MPSGraphTensor weights, NSArray<NSNumber> outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "convolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DDataGradient(MPSGraphTensor gradient, MPSGraphTensor weights, MPSGraphTensor outputShapeTensor, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    @Method(selector = "convolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DWeightsGradient(MPSGraphTensor incomingGradient, MPSGraphTensor source, NSArray<NSNumber> outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "convolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolution2DWeightsGradient(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphTensor outputShapeTensor, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    @Method(selector = "convolutionTranspose2DWithSourceTensor:weightsTensor:outputShape:descriptor:name:")
    public native MPSGraphTensor convolutionTranspose2D(MPSGraphTensor source, MPSGraphTensor weights, NSArray<NSNumber> outputShape, MPSGraphConvolution2DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "convolutionTranspose2DWithSourceTensor:weightsTensor:outputShapeTensor:descriptor:name:")
    public native MPSGraphTensor convolutionTranspose2D(MPSGraphTensor source, MPSGraphTensor weights, MPSGraphTensor outputShape, MPSGraphConvolution2DOpDescriptor descriptor, String name);
    @Method(selector = "convolutionTranspose2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DDataGradient(MPSGraphTensor incomingGradient, MPSGraphTensor weights, NSArray<NSNumber> outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "convolutionTranspose2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DDataGradient(MPSGraphTensor incomingGradient, MPSGraphTensor weights, MPSGraphTensor outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    @Method(selector = "convolutionTranspose2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWeightsGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor source, NSArray<NSNumber> outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "convolutionTranspose2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShapeTensor:forwardConvolutionDescriptor:name:")
    public native MPSGraphTensor convolutionTranspose2DWeightsGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor source, MPSGraphTensor outputShape, MPSGraphConvolution2DOpDescriptor forwardConvolutionDescriptor, String name);
    @Method(selector = "controlDependencyWithOperations:dependentBlock:name:")
    public native NSArray<MPSGraphTensor> controlDependency(NSArray<MPSGraphOperation> operations, @Block Block0<NSArray<MPSGraphTensor>> dependentBlock, String name);
    @Method(selector = "ifWithPredicateTensor:thenBlock:elseBlock:name:")
    public native NSArray<MPSGraphTensor> doIf(MPSGraphTensor predicateTensor, @Block Block0<NSArray<MPSGraphTensor>> thenBlock, @Block Block0<NSArray<MPSGraphTensor>> elseBlock, String name);
    @Method(selector = "whileWithInitialInputs:before:after:name:")
    public native NSArray<MPSGraphTensor> whileLoop(NSArray<MPSGraphTensor> initialInputs, @Block Block2<NSArray<MPSGraphTensor>, NSMutableArray<MPSGraphTensor>, MPSGraphTensor> before, @Block Block1<NSArray<MPSGraphTensor>, NSArray<MPSGraphTensor>> after, String name);
    @Method(selector = "forLoopWithLowerBound:upperBound:step:initialBodyArguments:body:name:")
    public native NSArray<MPSGraphTensor> forLoop(MPSGraphTensor lowerBound, MPSGraphTensor upperBound, MPSGraphTensor step, NSArray<MPSGraphTensor> initialBodyArguments, @Block Block2<MPSGraphTensor, NSArray<MPSGraphTensor>, NSArray<MPSGraphTensor>> body, String name);
    @Method(selector = "forLoopWithNumberOfIterations:initialBodyArguments:body:name:")
    public native NSArray<MPSGraphTensor> forLoop(MPSGraphTensor numberOfIterations, NSArray<MPSGraphTensor> initialBodyArguments, @Block Block2<MPSGraphTensor, NSArray<MPSGraphTensor>, NSArray<MPSGraphTensor>> body, String name);
    @Method(selector = "depthwiseConvolution2DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2D(MPSGraphTensor source, MPSGraphTensor weights, MPSGraphDepthwiseConvolution2DOpDescriptor descriptor, String name);
    @Method(selector = "depthwiseConvolution2DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2DDataGradient(MPSGraphTensor incomingGradient, MPSGraphTensor weights, NSArray<NSNumber> outputShape, MPSGraphDepthwiseConvolution2DOpDescriptor descriptor, String name);
    @Method(selector = "depthwiseConvolution2DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution2DWeightsGradient(MPSGraphTensor incomingGradient, MPSGraphTensor source, NSArray<NSNumber> outputShape, MPSGraphDepthwiseConvolution2DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "depthwiseConvolution3DWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution3D(MPSGraphTensor source, MPSGraphTensor weights, MPSGraphDepthwiseConvolution3DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "depthwiseConvolution3DDataGradientWithIncomingGradientTensor:weightsTensor:outputShape:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution3DDataGradient(MPSGraphTensor incomingGradient, MPSGraphTensor weights, NSArray<NSNumber> outputShape, MPSGraphDepthwiseConvolution3DOpDescriptor descriptor, String name);
    @Method(selector = "depthwiseConvolution3DWeightsGradientWithIncomingGradientTensor:sourceTensor:outputShape:descriptor:name:")
    public native MPSGraphTensor depthwiseConvolution3DWeightsGradient(MPSGraphTensor incomingGradient, MPSGraphTensor source, NSArray<NSNumber> outputShape, MPSGraphDepthwiseConvolution3DOpDescriptor descriptor, String name);
    @Method(selector = "gatherNDWithUpdatesTensor:indicesTensor:batchDimensions:name:")
    public native MPSGraphTensor gatherND(MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @MachineSizedUInt long batchDimensions, String name);
    @Method(selector = "gatherWithUpdatesTensor:indicesTensor:axis:batchDimensions:name:")
    public native MPSGraphTensor gather(MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @MachineSizedUInt long axis, @MachineSizedUInt long batchDimensions, String name);
    @Method(selector = "softMaxCrossEntropyWithSourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropy(MPSGraphTensor sourceTensor, MPSGraphTensor labelsTensor, @MachineSizedSInt long axis, MPSGraphLossReductionType reductionType, String name);
    @Method(selector = "softMaxCrossEntropyGradientWithIncomingGradientTensor:sourceTensor:labelsTensor:axis:reductionType:name:")
    public native MPSGraphTensor softMaxCrossEntropyGradient(MPSGraphTensor gradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor labelsTensor, @MachineSizedSInt long axis, MPSGraphLossReductionType reductionType, String name);
    @Method(selector = "matrixMultiplicationWithPrimaryTensor:secondaryTensor:name:")
    public native MPSGraphTensor matrixMultiplication(MPSGraphTensor primaryTensor, MPSGraphTensor secondaryTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "sparseTensorWithType:tensors:shape:dataType:name:")
    public native MPSGraphTensor sparseTensor(MPSGraphSparseStorageType sparseStorageType, NSArray<MPSGraphTensor> inputTensorArray, NSArray<NSNumber> shape, MPSDataType dataType, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "sparseTensorWithDescriptor:tensors:shape:name:")
    public native MPSGraphTensor sparseTensor(MPSGraphCreateSparseOpDescriptor sparseDescriptor, NSArray<MPSGraphTensor> inputTensorArray, NSArray<NSNumber> shape, String name);
    @Method(selector = "placeholderWithShape:dataType:name:")
    public native MPSGraphTensor placeholder(NSArray<NSNumber> shape, MPSDataType dataType, String name);
    @Method(selector = "placeholderWithShape:name:")
    public native MPSGraphTensor placeholder(NSArray<NSNumber> shape, String name);
    @Method(selector = "constantWithData:shape:dataType:")
    public native MPSGraphTensor constant(NSData data, NSArray<NSNumber> shape, MPSDataType dataType);
    @Method(selector = "constantWithScalar:dataType:")
    public native MPSGraphTensor constant(double scalar, MPSDataType dataType);
    @Method(selector = "constantWithScalar:shape:dataType:")
    public native MPSGraphTensor constant(double scalar, NSArray<NSNumber> shape, MPSDataType dataType);
    @Method(selector = "variableWithData:shape:dataType:name:")
    public native MPSGraphTensor variable(NSData data, NSArray<NSNumber> shape, MPSDataType dataType, String name);
    @Method(selector = "readVariable:name:")
    public native MPSGraphTensor readVariable(MPSGraphTensor variable, String name);
    @Method(selector = "assignVariable:withValueOfTensor:name:")
    public native MPSGraphOperation assignVariable(MPSGraphTensor variable, MPSGraphTensor tensor, String name);
    @Method(selector = "meanOfTensor:axes:name:")
    public native MPSGraphTensor mean(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "varianceOfTensor:meanTensor:axes:name:")
    public native MPSGraphTensor variance(MPSGraphTensor tensor, MPSGraphTensor meanTensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "varianceOfTensor:axes:name:")
    public native MPSGraphTensor variance(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "normalizationWithTensor:meanTensor:varianceTensor:gammaTensor:betaTensor:epsilon:name:")
    public native MPSGraphTensor normalization(MPSGraphTensor tensor, MPSGraphTensor mean, MPSGraphTensor variance, MPSGraphTensor gamma, MPSGraphTensor beta, float epsilon, String name);
    @Method(selector = "normalizationGammaGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGammaGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor meanTensor, MPSGraphTensor varianceTensor, NSArray<NSNumber> axes, float epsilon, String name);
    @Method(selector = "normalizationBetaGradientWithIncomingGradientTensor:sourceTensor:reductionAxes:name:")
    public native MPSGraphTensor normalizationBetaGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "normalizationGradientWithIncomingGradientTensor:sourceTensor:meanTensor:varianceTensor:gammaTensor:gammaGradientTensor:betaGradientTensor:reductionAxes:epsilon:name:")
    public native MPSGraphTensor normalizationGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, MPSGraphTensor meanTensor, MPSGraphTensor varianceTensor, MPSGraphTensor gamma, MPSGraphTensor gammaGradient, MPSGraphTensor betaGradient, NSArray<NSNumber> axes, float epsilon, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:axis:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, @MachineSizedUInt long axis, MPSDataType dataType, double onValue, double offValue, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:dataType:onValue:offValue:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, MPSDataType dataType, double onValue, double offValue, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:axis:dataType:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, @MachineSizedUInt long axis, MPSDataType dataType, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:axis:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, @MachineSizedUInt long axis, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:dataType:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, MPSDataType dataType, String name);
    @Method(selector = "oneHotWithIndicesTensor:depth:name:")
    public native MPSGraphTensor oneHot(MPSGraphTensor indicesTensor, @MachineSizedUInt long depth, String name);
    @Method(selector = "stochasticGradientDescentWithLearningRateTensor:valuesTensor:gradientTensor:name:")
    public native MPSGraphTensor stochasticGradientDescent(MPSGraphTensor learningRateTensor, MPSGraphTensor valuesTensor, MPSGraphTensor gradientTensor, String name);
    @Method(selector = "applyStochasticGradientDescentWithLearningRateTensor:variable:gradientTensor:name:")
    public native MPSGraphOperation applyStochasticGradientDescent(MPSGraphTensor learningRateTensor, MPSGraphVariableOp variable, MPSGraphTensor gradientTensor, String name);
    @Method(selector = "maxPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2D(MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);
    @Method(selector = "maxPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling2DGradient(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);
    @Method(selector = "avgPooling2DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2D(MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);
    @Method(selector = "avgPooling2DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling2D(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling2DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "maxPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4D(MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "maxPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor maxPooling4DGradient(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "avgPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4D(MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "avgPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor avgPooling4DGradient(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "L2NormPooling4DWithSourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4D(MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "L2NormPooling4DGradientWithGradientTensor:sourceTensor:descriptor:name:")
    public native MPSGraphTensor L2NormPooling4DGradient(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphPooling4DOpDescriptor descriptor, String name);
    @Method(selector = "randomPhiloxStateTensorWithSeed:name:")
    public native MPSGraphTensor randomPhiloxStateTensor(@MachineSizedUInt long seed, String name);
    @Method(selector = "randomPhiloxStateTensorWithCounterLow:counterHigh:key:name:")
    public native MPSGraphTensor randomPhiloxStateTensor(@MachineSizedUInt long counterLow, @MachineSizedUInt long counterHigh, @MachineSizedUInt long key, String name);
    @Method(selector = "randomTensorWithShape:descriptor:name:")
    public native MPSGraphTensor randomTensor(NSArray<NSNumber> shape, MPSGraphRandomOpDescriptor descriptor, String name);
    @Method(selector = "randomTensorWithShapeTensor:descriptor:name:")
    public native MPSGraphTensor randomTensor(MPSGraphTensor shapeTensor, MPSGraphRandomOpDescriptor descriptor, String name);
    @Method(selector = "randomTensorWithShape:descriptor:seed:name:")
    public native MPSGraphTensor randomTensor(NSArray<NSNumber> shape, MPSGraphRandomOpDescriptor descriptor, @MachineSizedUInt long seed, String name);
    @Method(selector = "randomTensorWithShapeTensor:descriptor:seed:name:")
    public native MPSGraphTensor randomTensor(MPSGraphTensor shapeTensor, MPSGraphRandomOpDescriptor descriptor, @MachineSizedUInt long seed, String name);
    @Method(selector = "randomTensorWithShape:descriptor:stateTensor:name:")
    public native NSArray<MPSGraphTensor> randomTensor(NSArray<NSNumber> shape, MPSGraphRandomOpDescriptor descriptor, MPSGraphTensor state, String name);
    @Method(selector = "randomTensorWithShapeTensor:descriptor:stateTensor:name:")
    public native NSArray<MPSGraphTensor> randomTensor(MPSGraphTensor shapeTensor, MPSGraphRandomOpDescriptor descriptor, MPSGraphTensor state, String name);
    @Method(selector = "randomUniformTensorWithShape:name:")
    public native MPSGraphTensor randomUniformTensor(NSArray<NSNumber> shape, String name);
    @Method(selector = "randomUniformTensorWithShapeTensor:name:")
    public native MPSGraphTensor randomUniformTensor(MPSGraphTensor shapeTensor, String name);
    @Method(selector = "randomUniformTensorWithShape:seed:name:")
    public native MPSGraphTensor randomUniformTensor(NSArray<NSNumber> shape, @MachineSizedUInt long seed, String name);
    @Method(selector = "randomUniformTensorWithShapeTensor:seed:name:")
    public native MPSGraphTensor randomUniformTensor(MPSGraphTensor shapeTensor, @MachineSizedUInt long seed, String name);
    @Method(selector = "randomUniformTensorWithShape:stateTensor:name:")
    public native NSArray<MPSGraphTensor> randomUniformTensor(NSArray<NSNumber> shape, MPSGraphTensor state, String name);
    @Method(selector = "randomUniformTensorWithShapeTensor:stateTensor:name:")
    public native NSArray<MPSGraphTensor> randomUniformTensor(MPSGraphTensor shapeTensor, MPSGraphTensor state, String name);
    @Method(selector = "dropoutTensor:rate:name:")
    public native MPSGraphTensor dropout(MPSGraphTensor tensor, double rate, String name);
    @Method(selector = "dropoutTensor:rateTensor:name:")
    public native MPSGraphTensor dropout(MPSGraphTensor tensor, MPSGraphTensor rate, String name);
    @Method(selector = "reductionSumWithTensor:axis:name:")
    public native MPSGraphTensor reductionSum(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionSumWithTensor:axes:name:")
    public native MPSGraphTensor reductionSum(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "reductionMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximum(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionMaximumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximum(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "reductionMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimum(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionMinimumWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimum(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "reductionMaximumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaN(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionMaximumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMaximumPropagateNaN(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "reductionMinimumPropagateNaNWithTensor:axis:name:")
    public native MPSGraphTensor reductionMinimumPropagateNa(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionMinimumPropagateNaNWithTensor:axes:name:")
    public native MPSGraphTensor reductionMinimumPropagateNaN(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    @Method(selector = "reductionProductWithTensor:axis:name:")
    public native MPSGraphTensor reductionProduct(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "reductionProductWithTensor:axes:name:")
    public native MPSGraphTensor reductionProduct(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reductionArgMaximumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMaximum(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reductionArgMinimumWithTensor:axis:name:")
    public native MPSGraphTensor reductionArgMinimum(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    @Method(selector = "resizeTensor:size:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeTensor(MPSGraphTensor imagesTensor, NSArray<NSNumber> size, MPSGraphResizeMode mode, boolean centerResult, boolean alignCorners, MPSGraphTensorNamedDataLayout layout, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "resizeTensor:sizeTensor:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resizeTensor(MPSGraphTensor imagesTensor, MPSGraphTensor size, MPSGraphResizeMode mode, boolean centerResult, boolean alignCorners, MPSGraphTensorNamedDataLayout layout, String name);
    @Method(selector = "resizeWithGradientTensor:input:mode:centerResult:alignCorners:layout:name:")
    public native MPSGraphTensor resize(MPSGraphTensor gradient, MPSGraphTensor input, MPSGraphResizeMode mode, boolean centerResult, boolean alignCorners, MPSGraphTensorNamedDataLayout layout, String name);
    @Method(selector = "scatterNDWithUpdatesTensor:indicesTensor:shape:batchDimensions:mode:name:")
    public native MPSGraphTensor scatterND(MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, NSArray<NSNumber> shape, @MachineSizedUInt long batchDimensions, MPSGraphScatterMode mode, String name);
    @Method(selector = "scatterNDWithUpdatesTensor:indicesTensor:shape:batchDimensions:name:")
    public native MPSGraphTensor scatterND(MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, NSArray<NSNumber> shape, @MachineSizedUInt long batchDimensions, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "scatterNDWithDataTensor:updatesTensor:indicesTensor:batchDimensions:mode:name:")
    public native MPSGraphTensor scatterND(MPSGraphTensor dataTensor, MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @MachineSizedUInt long batchDimensions, MPSGraphScatterMode mode, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "scatterWithUpdatesTensor:indicesTensor:shape:axis:mode:name:")
    public native MPSGraphTensor scatter(MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, NSArray<NSNumber> shape, @MachineSizedSInt long axis, MPSGraphScatterMode mode, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "scatterWithDataTensor:updatesTensor:indicesTensor:axis:mode:name:")
    public native MPSGraphTensor scatter(MPSGraphTensor dataTensor, MPSGraphTensor updatesTensor, MPSGraphTensor indicesTensor, @MachineSizedSInt long axis, MPSGraphScatterMode mode, String name);
    @Method(selector = "stencilWithSourceTensor:weightsTensor:descriptor:name:")
    public native MPSGraphTensor stencil(MPSGraphTensor source, MPSGraphTensor weights, MPSGraphStencilOpDescriptor descriptor, String name);
    @Method(selector = "reshapeTensor:withShape:name:")
    public native MPSGraphTensor reshapeTensor(MPSGraphTensor tensor, NSArray<NSNumber> shape, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reshapeTensor:withShapeTensor:name:")
    public native MPSGraphTensor reshapeTensor(MPSGraphTensor tensor, MPSGraphTensor shapeTensor, String name);
    @Method(selector = "transposeTensor:dimension:withDimension:name:")
    public native MPSGraphTensor transposeTensor(MPSGraphTensor tensor, @MachineSizedUInt long dimensionIndex, @MachineSizedUInt long dimensionIndex2, String name);
    @Method(selector = "sliceTensor:dimension:start:length:name:")
    public native MPSGraphTensor sliceTensor(MPSGraphTensor tensor, @MachineSizedUInt long dimensionIndex, @MachineSizedSInt long start, @MachineSizedSInt long length, String name);
    @Method(selector = "sliceTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceTensor(MPSGraphTensor tensor, NSArray<NSNumber> starts, NSArray<NSNumber> ends, NSArray<NSNumber> strides, String name);
    @Method(selector = "sliceTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceTensor(MPSGraphTensor tensor, NSArray<NSNumber> starts, NSArray<NSNumber> ends, NSArray<NSNumber> strides, int startMask, int endMask, int squeezeMask, String name);
    @Method(selector = "sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:name:")
    public native MPSGraphTensor sliceGradientTensor(MPSGraphTensor inputGradientTensor, MPSGraphTensor fwdInShapeTensor, NSArray<NSNumber> starts, NSArray<NSNumber> ends, NSArray<NSNumber> strides, String name);
    @Method(selector = "sliceGradientTensor:fwdInShapeTensor:starts:ends:strides:startMask:endMask:squeezeMask:name:")
    public native MPSGraphTensor sliceGradientTensor(MPSGraphTensor inputGradientTensor, MPSGraphTensor fwdInShapeTensor, NSArray<NSNumber> starts, NSArray<NSNumber> ends, NSArray<NSNumber> strides, int startMask, int endMask, int squeezeMask, String name);
    @Method(selector = "concatTensor:withTensor:dimension:name:")
    public native MPSGraphTensor concatTensor(MPSGraphTensor tensor, MPSGraphTensor tensor2, @MachineSizedSInt long dimensionIndex, String name);
    @Method(selector = "concatTensors:dimension:name:")
    public native MPSGraphTensor concatTensors(NSArray<MPSGraphTensor> tensors, @MachineSizedSInt long dimensionIndex, String name);
    @Method(selector = "concatTensors:dimension:interleave:name:")
    public native MPSGraphTensor concatTensors(NSArray<MPSGraphTensor> tensors, @MachineSizedSInt long dimensionIndex, boolean interleave, String name);
    @Method(selector = "tileTensor:withMultiplier:name:")
    public native MPSGraphTensor tileTensor(MPSGraphTensor tensor, NSArray<NSNumber> multiplier, String name);
    @Method(selector = "tileGradientWithIncomingGradientTensor:sourceTensor:withMultiplier:name:")
    public native MPSGraphTensor tileGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, NSArray<NSNumber> multiplier, String name);
    @Method(selector = "padTensor:withPaddingMode:leftPadding:rightPadding:constantValue:name:")
    public native MPSGraphTensor padTensor(MPSGraphTensor tensor, MPSGraphPaddingMode paddingMode, NSArray<NSNumber> leftPadding, NSArray<NSNumber> rightPadding, double constantValue, String name);
    @Method(selector = "padGradientWithIncomingGradientTensor:sourceTensor:paddingMode:leftPadding:rightPadding:name:")
    public native MPSGraphTensor padGradient(MPSGraphTensor incomingGradientTensor, MPSGraphTensor sourceTensor, MPSGraphPaddingMode paddingMode, NSArray<NSNumber> leftPadding, NSArray<NSNumber> rightPadding, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "spaceToDepth2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensor(MPSGraphTensor tensor, MPSGraphTensor widthAxisTensor, MPSGraphTensor heightAxisTensor, MPSGraphTensor depthAxisTensor, @MachineSizedUInt long blockSize, boolean usePixelShuffleOrder, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "depthToSpace2DTensor:widthAxisTensor:heightAxisTensor:depthAxisTensor:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensor(MPSGraphTensor tensor, MPSGraphTensor widthAxisTensor, MPSGraphTensor heightAxisTensor, MPSGraphTensor depthAxisTensor, @MachineSizedUInt long blockSize, boolean usePixelShuffleOrder, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "spaceToDepth2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor spaceToDepth2DTensor(MPSGraphTensor tensor, @MachineSizedUInt long widthAxis, @MachineSizedUInt long heightAxis, @MachineSizedUInt long depthAxis, @MachineSizedUInt long blockSize, boolean usePixelShuffleOrder, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "depthToSpace2DTensor:widthAxis:heightAxis:depthAxis:blockSize:usePixelShuffleOrder:name:")
    public native MPSGraphTensor depthToSpace2DTensor(MPSGraphTensor tensor, @MachineSizedUInt long widthAxis, @MachineSizedUInt long heightAxis, @MachineSizedUInt long depthAxis, @MachineSizedUInt long blockSize, boolean usePixelShuffleOrder, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reverseTensor:axesTensor:name:")
    public native MPSGraphTensor reverseTensor(MPSGraphTensor tensor, MPSGraphTensor axesTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reverseTensor:axes:name:")
    public native MPSGraphTensor reverseTensor(MPSGraphTensor tensor, NSArray<NSNumber> axes, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "reverseTensor:name:")
    public native MPSGraphTensor reverseTensor(MPSGraphTensor tensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "flatten2DTensor:axis:name:")
    public native MPSGraphTensor flatten2DTensor(MPSGraphTensor tensor, @MachineSizedSInt long axis, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "flatten2DTensor:axisTensor:name:")
    public native MPSGraphTensor flatten2DTensor(MPSGraphTensor tensor, MPSGraphTensor axisTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "broadcastTensor:toShape:name:")
    public native MPSGraphTensor broadcastTensor(MPSGraphTensor tensor, NSArray<NSNumber> shape, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "broadcastTensor:toShapeTensor:name:")
    public native MPSGraphTensor broadcastTensor(MPSGraphTensor tensor, MPSGraphTensor shapeTensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "shapeOfTensor:name:")
    public native MPSGraphTensor shapeOfTensor(MPSGraphTensor tensor, String name);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "castTensor:toType:name:")
    public native MPSGraphTensor castTensor(MPSGraphTensor tensor, MPSDataType type, String name);
    @Method(selector = "topKWithSourceTensor:k:name:")
    public native NSArray<MPSGraphTensor> topK(MPSGraphTensor source, @MachineSizedUInt long k, String name);
    @Method(selector = "topKWithSourceTensor:kTensor:name:")
    public native NSArray<MPSGraphTensor> topK(MPSGraphTensor source, MPSGraphTensor kTensor, String name);
    @Method(selector = "topKWithGradientTensor:source:k:name:")
    public native MPSGraphTensor topK(MPSGraphTensor gradient, MPSGraphTensor source, @MachineSizedUInt long k, String name);
    @Method(selector = "topKWithGradientTensor:source:kTensor:name:")
    public native MPSGraphTensor topK(MPSGraphTensor gradient, MPSGraphTensor source, MPSGraphTensor kTensor, String name);
    /*</methods>*/
}
