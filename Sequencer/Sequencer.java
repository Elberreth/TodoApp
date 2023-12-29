package se.lexicon.Sequencer;

import se.lexicon.util.SequencerEnum;

import java.util.HashMap;


public class Sequencer {



        private static final HashMap<SequencerEnum, Integer> sequencerIds = new HashMap<>();

        public static int getNextId(SequencerEnum sequencerEnum) {
            int currentId = sequencerIds.getOrDefault(sequencerEnum, 0);
            sequencerIds.put(sequencerEnum, currentId + 1);
            return currentId + 1;
        }

        public static int getCurrentId(SequencerEnum sequencerEnum) {
            return sequencerIds.getOrDefault(sequencerEnum, 0);
        }

        public static void setId(int id, SequencerEnum sequencerEnum) {
            sequencerIds.put(sequencerEnum, id);
        }
    }