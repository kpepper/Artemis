/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Sep 19 21:56:09 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ChadoTransaction_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.chado.ChadoTransaction"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChadoTransaction_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.ExternalProgram",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "org.gmod.schema.dao.CvDaoI",
      "org.gmod.schema.cv.CvTerm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.utils.Rankable",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.apache.log4j.Priority",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChadoTransaction_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.gmod.schema.sequence.FeatureProp",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.postgresql.util.SharedTimer",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.map.ValuePool",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.Qualifier",
      "org.gmod.schema.organism.Organism",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.apache.log4j.MDC",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.chado.DbSqlConfig",
      "com.ibatis.common.resources.Resources",
      "com.ibatis.sqlmap.client.SqlMapClientBuilder",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser",
      "com.ibatis.common.xml.NodeletParser",
      "com.ibatis.sqlmap.engine.builder.xml.XmlParserState",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "com.ibatis.sqlmap.engine.type.BooleanTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteTypeHandler",
      "com.ibatis.sqlmap.engine.type.ShortTypeHandler",
      "com.ibatis.sqlmap.engine.type.IntegerTypeHandler",
      "com.ibatis.sqlmap.engine.type.LongTypeHandler",
      "com.ibatis.sqlmap.engine.type.FloatTypeHandler",
      "com.ibatis.sqlmap.engine.type.DoubleTypeHandler",
      "com.ibatis.sqlmap.engine.type.StringTypeHandler",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "com.ibatis.sqlmap.engine.type.ClobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.BigDecimalTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteArrayTypeHandler",
      "com.ibatis.sqlmap.engine.type.BlobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.ObjectTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "com.ibatis.sqlmap.engine.exchange.DomDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ListDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "com.ibatis.sqlmap.engine.exchange.PrimitiveDataExchange",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "uk.ac.sanger.artemis.io.GFFEntryInformation",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.seq.SimpleAssembly",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.SimpleFeatureRealizer$TemplateImpl",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "org.biojava.bio.seq.impl.AssembledSymbolList",
      "org.biojava.utils.Unchangeable",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.utils.cache.WeakValueHashMap",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.ListTools$5",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.utils.ClassTools",
      "org.biojava.utils.stax.SAX2StAXAdaptor",
      "org.biojava.utils.stax.StAXContentHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler",
      "org.biojava.utils.stax.SAX2StAXAdaptor$HandlerBinding",
      "org.biojava.utils.stax.SAX2StAXAdaptor$S2SDelegationManager",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.stax.StringElementHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler$1",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "org.biojava.utils.ChangeListener",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.utils.ChangeType$1",
      "org.biojava.utils.ChangeForwarder",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler$1",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler$MappingHandler",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.seq.io.SeqIOAdapter",
      "org.biojava.bio.symbol.SimpleSymbolList$SSLIOListener",
      "org.biojava.bio.seq.io.CharacterTokenization$TPStreamParser",
      "org.biojava.bio.seq.DNATools$DNAComplementTranslationTable",
      "org.biojava.bio.symbol.AbstractTranslationTable",
      "org.biojava.bio.symbol.AbstractReversibleTranslationTable",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.seq.RNATools$RNAComplementTranslationTable",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "org.biojava.utils.ListTools$Triplet",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "org.biojava.utils.cache.KeyedWeakReference",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.symbol.AbstractManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.RNATools",
      "org.biojava.bio.seq.DNATools",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "org.gmod.schema.sequence.FeatureLoc",
      "com.sshtools.j2ssh.io.ByteArrayReader",
      "org.postgresql.Driver$1",
      "org.postgresql.PGProperty",
      "org.postgresql.jdbc.PgConnection",
      "org.postgresql.util.HostSpec",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.hostchooser.HostRequirement",
      "org.postgresql.core.SocketFactoryFactory",
      "org.postgresql.hostchooser.HostChooserFactory",
      "org.postgresql.hostchooser.SingleHostChooser",
      "org.postgresql.hostchooser.CandidateHost",
      "org.postgresql.core.PGStream",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.gmod.schema.sequence.FeatureRelationship",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.util.URLDocument",
      "uk.ac.sanger.artemis.chado.ChadoCvTermView",
      "uk.ac.sanger.artemis.plot.FeatureAlgorithm",
      "uk.ac.sanger.artemis.plot.HydroAlgorithm",
      "uk.ac.sanger.artemis.plot.HydrophilicityAlgorithm",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry$1",
      "uk.ac.sanger.artemis.Entry$FeatureEnumerator",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "org.apache.log4j.helpers.NullEnumeration",
      "uk.ac.sanger.artemis.io.DatabaseInferredFeature",
      "org.gmod.schema.utils.CollectionUtils",
      "org.gmod.schema.pub.Pub",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "uk.ac.sanger.artemis.j2ssh.SshFileManager",
      "org.apache.log4j.Layout",
      "org.apache.log4j.helpers.DateLayout",
      "org.apache.log4j.TTCCLayout",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.ActionVector",
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.FilteredEntryGroup$1",
      "uk.ac.sanger.artemis.FilteredEntryGroup$2",
      "uk.ac.sanger.artemis.FilteredEntryGroup$3",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.helpers.QuietWriter",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.apache.log4j.FileAppender",
      "org.apache.log4j.DailyRollingFileAppender",
      "org.apache.log4j.RollingCalendar",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.bio.seq.db.SimpleIndex"
    );
  }
}
