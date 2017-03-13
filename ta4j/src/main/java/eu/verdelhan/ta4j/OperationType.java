/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.verdelhan.ta4j;

/**
 *
 * @author sunzhu
 */
public enum OperationType {
    ENTER {
        @Override
        public OperationType complementType() {
            return EXIT;
        }
    },
    EXIT {
        @Override
        public OperationType complementType() {
            return ENTER;
        }
    },
    NA {
        @Override
        public OperationType complementType() {
            return NA;
        }
    };

    /**
     * @return the complementary order type
     */
    public abstract OperationType complementType();
}
