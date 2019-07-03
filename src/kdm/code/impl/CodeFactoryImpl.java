/**
 */
package kdm.code.impl;

import kdm.code.ArrayType;
import kdm.code.BagType;
import kdm.code.BitType;
import kdm.code.BitstringType;
import kdm.code.BooleanType;
import kdm.code.CallableKind;
import kdm.code.CallableUnit;
import kdm.code.CharType;
import kdm.code.ChoiceType;
import kdm.code.ClassUnit;
import kdm.code.CodeAssembly;
import kdm.code.CodeElement;
import kdm.code.CodeFactory;
import kdm.code.CodeModel;
import kdm.code.CodePackage;
import kdm.code.CodeRelationship;
import kdm.code.CommentUnit;
import kdm.code.CompilationUnit;
import kdm.code.CompositeType;
import kdm.code.ComputationalObject;
import kdm.code.ConditionalDirective;
import kdm.code.ControlElement;
import kdm.code.DataElement;
import kdm.code.Datatype;
import kdm.code.DateType;
import kdm.code.DecimalType;
import kdm.code.DerivedType;
import kdm.code.EnumeratedType;
import kdm.code.Expands;
import kdm.code.ExportKind;
import kdm.code.Extends;
import kdm.code.FloatType;
import kdm.code.GeneratedFrom;
import kdm.code.HasType;
import kdm.code.HasValue;
import kdm.code.ImplementationOf;
import kdm.code.Implements;
import kdm.code.Imports;
import kdm.code.IncludeDirective;
import kdm.code.Includes;
import kdm.code.IndexUnit;
import kdm.code.InstanceOf;
import kdm.code.IntegerType;
import kdm.code.InterfaceUnit;
import kdm.code.ItemUnit;
import kdm.code.LanguageUnit;
import kdm.code.MacroDirective;
import kdm.code.MacroKind;
import kdm.code.MacroUnit;
import kdm.code.MemberUnit;
import kdm.code.MethodKind;
import kdm.code.MethodUnit;
import kdm.code.Namespace;
import kdm.code.OctetType;
import kdm.code.OctetstringType;
import kdm.code.OrdinalType;
import kdm.code.ParameterKind;
import kdm.code.ParameterTo;
import kdm.code.ParameterUnit;
import kdm.code.PointerType;
import kdm.code.PreprocessorDirective;
import kdm.code.PrimitiveType;
import kdm.code.RangeType;
import kdm.code.RecordType;
import kdm.code.Redefines;
import kdm.code.ScaledType;
import kdm.code.SequenceType;
import kdm.code.SetType;
import kdm.code.SharedUnit;
import kdm.code.Signature;
import kdm.code.StorableKind;
import kdm.code.StorableUnit;
import kdm.code.StringType;
import kdm.code.SynonymUnit;
import kdm.code.TemplateParameter;
import kdm.code.TemplateType;
import kdm.code.TemplateUnit;
import kdm.code.TimeType;
import kdm.code.TypeUnit;
import kdm.code.Value;
import kdm.code.ValueList;
import kdm.code.VariantTo;
import kdm.code.VisibleIn;
import kdm.code.VoidType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory(CodePackage.eNS_URI);
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodePackage.CODE_MODEL: return createCodeModel();
			case CodePackage.COMPUTATIONAL_OBJECT: return createComputationalObject();
			case CodePackage.DATATYPE: return createDatatype();
			case CodePackage.MODULE: return createModule();
			case CodePackage.COMPILATION_UNIT: return createCompilationUnit();
			case CodePackage.SHARED_UNIT: return createSharedUnit();
			case CodePackage.LANGUAGE_UNIT: return createLanguageUnit();
			case CodePackage.CODE_ASSEMBLY: return createCodeAssembly();
			case CodePackage.PACKAGE: return createPackage();
			case CodePackage.CONTROL_ELEMENT: return createControlElement();
			case CodePackage.CALLABLE_UNIT: return createCallableUnit();
			case CodePackage.METHOD_UNIT: return createMethodUnit();
			case CodePackage.DATA_ELEMENT: return createDataElement();
			case CodePackage.STORABLE_UNIT: return createStorableUnit();
			case CodePackage.ITEM_UNIT: return createItemUnit();
			case CodePackage.INDEX_UNIT: return createIndexUnit();
			case CodePackage.MEMBER_UNIT: return createMemberUnit();
			case CodePackage.PARAMETER_UNIT: return createParameterUnit();
			case CodePackage.VALUE: return createValue();
			case CodePackage.VALUE_LIST: return createValueList();
			case CodePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case CodePackage.BOOLEAN_TYPE: return createBooleanType();
			case CodePackage.CHAR_TYPE: return createCharType();
			case CodePackage.ORDINAL_TYPE: return createOrdinalType();
			case CodePackage.DATE_TYPE: return createDateType();
			case CodePackage.TIME_TYPE: return createTimeType();
			case CodePackage.INTEGER_TYPE: return createIntegerType();
			case CodePackage.DECIMAL_TYPE: return createDecimalType();
			case CodePackage.SCALED_TYPE: return createScaledType();
			case CodePackage.FLOAT_TYPE: return createFloatType();
			case CodePackage.VOID_TYPE: return createVoidType();
			case CodePackage.STRING_TYPE: return createStringType();
			case CodePackage.BIT_TYPE: return createBitType();
			case CodePackage.BITSTRING_TYPE: return createBitstringType();
			case CodePackage.OCTET_TYPE: return createOctetType();
			case CodePackage.OCTETSTRING_TYPE: return createOctetstringType();
			case CodePackage.ENUMERATED_TYPE: return createEnumeratedType();
			case CodePackage.COMPOSITE_TYPE: return createCompositeType();
			case CodePackage.CHOICE_TYPE: return createChoiceType();
			case CodePackage.RECORD_TYPE: return createRecordType();
			case CodePackage.DERIVED_TYPE: return createDerivedType();
			case CodePackage.ARRAY_TYPE: return createArrayType();
			case CodePackage.POINTER_TYPE: return createPointerType();
			case CodePackage.RANGE_TYPE: return createRangeType();
			case CodePackage.BAG_TYPE: return createBagType();
			case CodePackage.SET_TYPE: return createSetType();
			case CodePackage.SEQUENCE_TYPE: return createSequenceType();
			case CodePackage.SIGNATURE: return createSignature();
			case CodePackage.TYPE_UNIT: return createTypeUnit();
			case CodePackage.SYNONYM_UNIT: return createSynonymUnit();
			case CodePackage.CLASS_UNIT: return createClassUnit();
			case CodePackage.INTERFACE_UNIT: return createInterfaceUnit();
			case CodePackage.TEMPLATE_UNIT: return createTemplateUnit();
			case CodePackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case CodePackage.TEMPLATE_TYPE: return createTemplateType();
			case CodePackage.INSTANCE_OF: return createInstanceOf();
			case CodePackage.PARAMETER_TO: return createParameterTo();
			case CodePackage.IMPLEMENTS: return createImplements();
			case CodePackage.IMPLEMENTATION_OF: return createImplementationOf();
			case CodePackage.HAS_TYPE: return createHasType();
			case CodePackage.HAS_VALUE: return createHasValue();
			case CodePackage.EXTENDS: return createExtends();
			case CodePackage.PREPROCESSOR_DIRECTIVE: return createPreprocessorDirective();
			case CodePackage.MACRO_UNIT: return createMacroUnit();
			case CodePackage.MACRO_DIRECTIVE: return createMacroDirective();
			case CodePackage.INCLUDE_DIRECTIVE: return createIncludeDirective();
			case CodePackage.CONDITIONAL_DIRECTIVE: return createConditionalDirective();
			case CodePackage.EXPANDS: return createExpands();
			case CodePackage.GENERATED_FROM: return createGeneratedFrom();
			case CodePackage.INCLUDES: return createIncludes();
			case CodePackage.VARIANT_TO: return createVariantTo();
			case CodePackage.REDEFINES: return createRedefines();
			case CodePackage.COMMENT_UNIT: return createCommentUnit();
			case CodePackage.NAMESPACE: return createNamespace();
			case CodePackage.VISIBLE_IN: return createVisibleIn();
			case CodePackage.IMPORTS: return createImports();
			case CodePackage.CODE_ELEMENT: return createCodeElement();
			case CodePackage.CODE_RELATIONSHIP: return createCodeRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CodePackage.CALLABLE_KIND:
				return createCallableKindFromString(eDataType, initialValue);
			case CodePackage.METHOD_KIND:
				return createMethodKindFromString(eDataType, initialValue);
			case CodePackage.EXPORT_KIND:
				return createExportKindFromString(eDataType, initialValue);
			case CodePackage.STORABLE_KIND:
				return createStorableKindFromString(eDataType, initialValue);
			case CodePackage.PARAMETER_KIND:
				return createParameterKindFromString(eDataType, initialValue);
			case CodePackage.MACRO_KIND:
				return createMacroKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CodePackage.CALLABLE_KIND:
				return convertCallableKindToString(eDataType, instanceValue);
			case CodePackage.METHOD_KIND:
				return convertMethodKindToString(eDataType, instanceValue);
			case CodePackage.EXPORT_KIND:
				return convertExportKindToString(eDataType, instanceValue);
			case CodePackage.STORABLE_KIND:
				return convertStorableKindToString(eDataType, instanceValue);
			case CodePackage.PARAMETER_KIND:
				return convertParameterKindToString(eDataType, instanceValue);
			case CodePackage.MACRO_KIND:
				return convertMacroKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeModel createCodeModel() {
		CodeModelImpl codeModel = new CodeModelImpl();
		return codeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputationalObject createComputationalObject() {
		ComputationalObjectImpl computationalObject = new ComputationalObjectImpl();
		return computationalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public kdm.code.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SharedUnit createSharedUnit() {
		SharedUnitImpl sharedUnit = new SharedUnitImpl();
		return sharedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageUnit createLanguageUnit() {
		LanguageUnitImpl languageUnit = new LanguageUnitImpl();
		return languageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAssembly createCodeAssembly() {
		CodeAssemblyImpl codeAssembly = new CodeAssemblyImpl();
		return codeAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public kdm.code.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlElement createControlElement() {
		ControlElementImpl controlElement = new ControlElementImpl();
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableUnit createCallableUnit() {
		CallableUnitImpl callableUnit = new CallableUnitImpl();
		return callableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodUnit createMethodUnit() {
		MethodUnitImpl methodUnit = new MethodUnitImpl();
		return methodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorableUnit createStorableUnit() {
		StorableUnitImpl storableUnit = new StorableUnitImpl();
		return storableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemUnit createItemUnit() {
		ItemUnitImpl itemUnit = new ItemUnitImpl();
		return itemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexUnit createIndexUnit() {
		IndexUnitImpl indexUnit = new IndexUnitImpl();
		return indexUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberUnit createMemberUnit() {
		MemberUnitImpl memberUnit = new MemberUnitImpl();
		return memberUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterUnit createParameterUnit() {
		ParameterUnitImpl parameterUnit = new ParameterUnitImpl();
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueList createValueList() {
		ValueListImpl valueList = new ValueListImpl();
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharType createCharType() {
		CharTypeImpl charType = new CharTypeImpl();
		return charType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrdinalType createOrdinalType() {
		OrdinalTypeImpl ordinalType = new OrdinalTypeImpl();
		return ordinalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalType createDecimalType() {
		DecimalTypeImpl decimalType = new DecimalTypeImpl();
		return decimalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaledType createScaledType() {
		ScaledTypeImpl scaledType = new ScaledTypeImpl();
		return scaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BitType createBitType() {
		BitTypeImpl bitType = new BitTypeImpl();
		return bitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BitstringType createBitstringType() {
		BitstringTypeImpl bitstringType = new BitstringTypeImpl();
		return bitstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OctetType createOctetType() {
		OctetTypeImpl octetType = new OctetTypeImpl();
		return octetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OctetstringType createOctetstringType() {
		OctetstringTypeImpl octetstringType = new OctetstringTypeImpl();
		return octetstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumeratedType createEnumeratedType() {
		EnumeratedTypeImpl enumeratedType = new EnumeratedTypeImpl();
		return enumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceType createChoiceType() {
		ChoiceTypeImpl choiceType = new ChoiceTypeImpl();
		return choiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordType createRecordType() {
		RecordTypeImpl recordType = new RecordTypeImpl();
		return recordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedType createDerivedType() {
		DerivedTypeImpl derivedType = new DerivedTypeImpl();
		return derivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeUnit createTypeUnit() {
		TypeUnitImpl typeUnit = new TypeUnitImpl();
		return typeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynonymUnit createSynonymUnit() {
		SynonymUnitImpl synonymUnit = new SynonymUnitImpl();
		return synonymUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassUnit createClassUnit() {
		ClassUnitImpl classUnit = new ClassUnitImpl();
		return classUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceUnit createInterfaceUnit() {
		InterfaceUnitImpl interfaceUnit = new InterfaceUnitImpl();
		return interfaceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateUnit createTemplateUnit() {
		TemplateUnitImpl templateUnit = new TemplateUnitImpl();
		return templateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateType createTemplateType() {
		TemplateTypeImpl templateType = new TemplateTypeImpl();
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceOf createInstanceOf() {
		InstanceOfImpl instanceOf = new InstanceOfImpl();
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterTo createParameterTo() {
		ParameterToImpl parameterTo = new ParameterToImpl();
		return parameterTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implements createImplements() {
		ImplementsImpl implements_ = new ImplementsImpl();
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationOf createImplementationOf() {
		ImplementationOfImpl implementationOf = new ImplementationOfImpl();
		return implementationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasType createHasType() {
		HasTypeImpl hasType = new HasTypeImpl();
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasValue createHasValue() {
		HasValueImpl hasValue = new HasValueImpl();
		return hasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extends createExtends() {
		ExtendsImpl extends_ = new ExtendsImpl();
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreprocessorDirective createPreprocessorDirective() {
		PreprocessorDirectiveImpl preprocessorDirective = new PreprocessorDirectiveImpl();
		return preprocessorDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacroUnit createMacroUnit() {
		MacroUnitImpl macroUnit = new MacroUnitImpl();
		return macroUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacroDirective createMacroDirective() {
		MacroDirectiveImpl macroDirective = new MacroDirectiveImpl();
		return macroDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeDirective createIncludeDirective() {
		IncludeDirectiveImpl includeDirective = new IncludeDirectiveImpl();
		return includeDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalDirective createConditionalDirective() {
		ConditionalDirectiveImpl conditionalDirective = new ConditionalDirectiveImpl();
		return conditionalDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expands createExpands() {
		ExpandsImpl expands = new ExpandsImpl();
		return expands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratedFrom createGeneratedFrom() {
		GeneratedFromImpl generatedFrom = new GeneratedFromImpl();
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantTo createVariantTo() {
		VariantToImpl variantTo = new VariantToImpl();
		return variantTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Redefines createRedefines() {
		RedefinesImpl redefines = new RedefinesImpl();
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentUnit createCommentUnit() {
		CommentUnitImpl commentUnit = new CommentUnitImpl();
		return commentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibleIn createVisibleIn() {
		VisibleInImpl visibleIn = new VisibleInImpl();
		return visibleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeElement createCodeElement() {
		CodeElementImpl codeElement = new CodeElementImpl();
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeRelationship createCodeRelationship() {
		CodeRelationshipImpl codeRelationship = new CodeRelationshipImpl();
		return codeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableKind createCallableKindFromString(EDataType eDataType, String initialValue) {
		CallableKind result = CallableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodKind createMethodKindFromString(EDataType eDataType, String initialValue) {
		MethodKind result = MethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportKind createExportKindFromString(EDataType eDataType, String initialValue) {
		ExportKind result = ExportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableKind createStorableKindFromString(EDataType eDataType, String initialValue) {
		StorableKind result = StorableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
		ParameterKind result = ParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroKind createMacroKindFromString(EDataType eDataType, String initialValue) {
		MacroKind result = MacroKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacroKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePackage getCodePackage() {
		return (CodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
