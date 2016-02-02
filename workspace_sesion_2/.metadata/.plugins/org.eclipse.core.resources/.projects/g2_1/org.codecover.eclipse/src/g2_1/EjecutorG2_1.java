package g2_1;

public class EjecutorG2_1 {
  static {
    CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.ping();
  }

	
	public static int hexDigToDec (char unaLetra)
	{
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[1]++;
int ret=-1;
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[2]++;
boolean esCifra=false;
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[3]++;
boolean esLetraHex=false;
int CodeCoverConditionCoverageHelper_C1;
		
		//convierto todo a minusculas
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[4]++;
if ((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (8)) == 0 || true) &&
 ((unaLetra>='A') && 
  ((CodeCoverConditionCoverageHelper_C1 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((unaLetra<='F') && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) || true)) || (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) && false)) {
CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[1]++;
			CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[5]++;
unaLetra=Character.toLowerCase(unaLetra);
} else {
  CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[2]++;}
			
		
		//compruebo si entrada está bien
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[6]++;
esLetraHex=(unaLetra>='a' && unaLetra<='f');
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[7]++;
esCifra=(unaLetra>='0' && unaLetra<='9');
int CodeCoverConditionCoverageHelper_C2;
				
		
		//proceso
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[8]++;
if ((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((esCifra) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)) {
CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[3]++; //if (unaLetra>='a' && unaLetra<='f') OR
					//(unaLetra>='0' && unaLetra<='9')
			CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[9]++;
ret=Character.getNumericValue(unaLetra);
}
		else {
CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[4]++;
int CodeCoverConditionCoverageHelper_C3;
			CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[10]++;
if((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((esLetraHex) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[5]++;
				CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[11]++;
ret=10+unaLetra-'a';
} else {
  CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.branches[6]++;}
}
		
				
	
		
		
		CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht.statements[12]++;
return ret;
	}

}

class CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("/home/barfelix/EVT2015/workspace_sesion_2/.metadata/.plugins/org.eclipse.core.resources/.projects/g2_1/org.codecover.eclipse/coverage-logs/coverage-log-file.clf"), "ac060173-9fde-4202-a21f-c585e56ddfe5").addObservedContainer(new CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht ());
  }
    public static long[] statements = new long[13];
    public static long[] branches = new long[7];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[4];
  static {
    final String SECTION_NAME = "g2_1.EjecutorG2_1.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,2,1,1};
    for (int i = 1; i <= 3; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[1];
    public static java.util.concurrent.atomic.AtomicLong[] syncs = new java.util.concurrent.atomic.AtomicLong[3];
    static {
      for (int i = 0; i <= 2; i++) {
        syncs[i] = new java.util.concurrent.atomic.AtomicLong(0L);
      }
    }
    public static java.util.Hashtable[] syncWaits = new java.util.Hashtable[1];
    static {
      for (int i = 0; i <= 0; i++) {
        syncWaits[i] = new java.util.Hashtable();
      }
    }
    public static long[] qmo = new long[2];

  public CodeCoverCoverageCounter$t81te03d9gbcw31rdwo5rq3iht () {
    super("g2_1.EjecutorG2_1.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 12; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 6; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 3; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
      for (int i = 0; i <= 2; i++) {
        syncs[i].set(0L);
      }
      for (int i = 0; i < 2; i++) {
        qmo[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("g2_1.EjecutorG2_1.java");
      for (int i = 1; i <= 12; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 6; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 3; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
      for (int i = 0; i <= 0; i++) {
        if (syncs[i * 3].get() != 0L) {
          log.passCounter("Y" + i + "-0", syncs[i * 3].get());
          syncs[i * 3].set(0L);
        }
        if (syncs[i * 3 + 1].get() != 0L) {
          log.passCounter("Y" + i + "-1", syncs[i * 3 + 1].get());
          syncs[i * 3 + 1].set(0L);
        }
        if (syncs[i * 3 + 2].get() != 0L) {
          log.passCounter("Y" + i + "-2", syncs[i * 3 + 2].get());
          syncs[i * 3 + 2].set(0L);
        }
      }
      for (int i = 0; i < 1; i++) {
        if (qmo[i * 2] != 0L) {
          log.passCounter("Q" + i + "-0", qmo[i * 2]);
          qmo[i * 2] = 0L;
        }
        if (qmo[i * 2 + 1] != 0L) {
          log.passCounter("Q" + i + "-1", qmo[i * 2 + 1]);
          qmo[i * 2 + 1] = 0L;
        }
      }
  }
}

