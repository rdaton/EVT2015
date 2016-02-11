package g2_3;

public class EjecutorG2_3 {
  static {
    CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.ping();
  }

	
		static public int hexToDec(String palabra)
		{
			CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[1]++;
int unNumero=0;			
			CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[2]++;
int ptro=0;
byte CodeCoverLoopChoiceHelper_L1 = 0;


int CodeCoverConditionCoverageHelper_C1;
			
			CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[3]++;
CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.loops[1]++;
for (int i=0;(((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((i<palabra.length()) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false);i++)
			{
if (CodeCoverLoopChoiceHelper_L1 == 0) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.loops[1]--;
  CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.loops[2]++;
} else if (CodeCoverLoopChoiceHelper_L1 == 1) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.loops[2]--;
  CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.loops[3]++;
}
				CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[4]++;
ptro=unHex.hexDigToDec(palabra.charAt(i));
int CodeCoverConditionCoverageHelper_C2;
				CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[5]++;
if ((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((ptro==-1) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)) {
CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.branches[1]++; CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[6]++;
return -1;
} else {
  CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.branches[2]++;}
				CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[7]++;
unNumero*=16;
				CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[8]++;
unNumero+=ptro;				
			}
			
			CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup.statements[9]++;
return unNumero;
		}
}

class CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("/home/barfelix/EVT2015/workspace_sesion_2/.metadata/.plugins/org.eclipse.core.resources/.projects/g2/org.codecover.eclipse/coverage-logs/coverage-log-file.clf"), "9f342e9c-461f-4ea1-9b35-d6235e0120ac").addObservedContainer(new CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup ());
  }
    public static long[] statements = new long[10];
    public static long[] branches = new long[3];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[3];
  static {
    final String SECTION_NAME = "g2_3.EjecutorG2_3.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,1};
    for (int i = 1; i <= 2; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[4];
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

  public CodeCoverCoverageCounter$t81te03d9gbcw31rdxg7zjrlup () {
    super("g2_3.EjecutorG2_3.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 9; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 2; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 2; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 3; i++) {
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
    log.startNamedSection("g2_3.EjecutorG2_3.java");
      for (int i = 1; i <= 9; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 2; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 2; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 1; i++) {
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

