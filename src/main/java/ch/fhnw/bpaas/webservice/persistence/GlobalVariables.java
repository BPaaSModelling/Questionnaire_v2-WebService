package ch.fhnw.bpaas.webservice.persistence;

public class GlobalVariables {

	public static final String TEMPCLOUDSERVICE = "questiondata:tempCloudService";
	public static final String QUESTIONNAIRE_INTERPRETATION_RULESET = "01_questionnaire_interpretation_ruleset.txt";
	public static final String REASONING_RULESET = "02_reasoning_ruleset.txt";
	
	public static final String LOG_01_AFTER_REASONING = "01_after_reasoning.txt";
	public static final String LOG_02_TEMPMODEL_01 = "02_tempmodel_after_setup.txt";
	public static final String LOG_03_TEMPMODEL_02 = "03_tempmodel_after_questTranslation.txt";
	public static final String LOG_04_TEMPMODEL = "04_tempmodel_tempCloudService.txt";
	public static final String LOG_05_TEMPMODEL = "05_tempmodel_after_filling_tempCS.txt";
	
	public static final String FUNKTIONAL_URI = "http://ikm-group.ch/archiMEO/questionnaire#Functional";
	public static final String DOMAIN_SELECTION_QUESTION = "http://ikm-group.ch/archiMEO/questiondata#Select_the_category_you_would_like_to_specify";
	
	public static final String ANSWERTYPE_VALUEINSERT = "http://ikm-group.ch/archiMEO/questionnaire#ValueInsert";
	public static final String ANSWERTYPE_SEARCH_SELECTION = "http://ikm-group.ch/archiMEO/questionnaire#SearchSelection";
	public static final String ANSWERTYPE_MULTI_SELECTION = "http://ikm-group.ch/archiMEO/questionnaire#MultiSelection";
	public static final String ANSWERTYPE_SINGLE_SELECTION = "http://ikm-group.ch/archiMEO/questionnaire#SingleSelection";
	
	public static final String MAIN_MODEL_EXPORT = "main_model_export.txt";
	
	public static final String OPERATION_GREATEREQUALSTHAN = "http://ikm-group.ch/archiMEO/questionnaire#GreaterEqualsThan";
	public static final String OPERATION_GREATERTHAN = "http://ikm-group.ch/archiMEO/questionnaire#GreaterThan";
	public static final String OPERATION_LESSEQUALSTHAN = "http://ikm-group.ch/archiMEO/questionnaire#LessEqualsThan";
	public static final String OPERATION_LESSTHAN = "http://ikm-group.ch/archiMEO/questionnaire#LessThan";
	public static final String OPERATION_EQUALS = "http://ikm-group.ch/archiMEO/questionnaire#Equals";
	public static final String OPERATION_NOTEQUAL = "http://ikm-group.ch/archiMEO/questionnaire#NotEqual";

	public static final String BOOLEAN_TRUE_URI = "true^^http://www.w3.org/2001/XMLSchema#boolean";
	public static final String BOOLEAN_FALSE_URI = "false^^http://www.w3.org/2001/XMLSchema#boolean";
	
	public static String getComparisonOperatorString(String operatorURI){
		String result = "";
		switch(operatorURI){
		case GlobalVariables.OPERATION_GREATEREQUALSTHAN:
			result = ">=";
			break;
		case GlobalVariables.OPERATION_GREATERTHAN:
			result = ">";
			break;
		case GlobalVariables.OPERATION_LESSEQUALSTHAN:
			result = "<=";
			break;
		case GlobalVariables.OPERATION_LESSTHAN:
			result = "<";
			break;
		case GlobalVariables.OPERATION_NOTEQUAL:
			result = "!=";
			break;
		default:
			result = "=";
			break;
		}
		return result;
	}
}
