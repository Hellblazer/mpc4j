package edu.alibaba.mpc4j.s2pc.aby.operator.row.wrap.zl;

import edu.alibaba.mpc4j.common.rpc.MpcAbortException;
import edu.alibaba.mpc4j.common.rpc.pto.TwoPartyPto;
import edu.alibaba.mpc4j.s2pc.aby.basics.z2.SquareZ2Vector;

/**
 * Zl wrap protocol party.
 *
 * @author Liqiang Peng
 * @date 2024/5/30
 */
public interface ZlWrapParty extends TwoPartyPto {
    /**
     * Inits the protocol.
     *
     * @param maxL   max input bit length.
     * @param maxNum max num.
     * @throws MpcAbortException the protocol failure aborts.
     */
    void init(int maxL, int maxNum) throws MpcAbortException;

    /**
     * Executes the protocol.
     *
     * @param l      input bit length.
     * @param inputs the party's inputs.
     * @return the party's output.
     * @throws MpcAbortException the protocol failure aborts.
     */
    SquareZ2Vector wrap(int l, byte[][] inputs) throws MpcAbortException;
}
