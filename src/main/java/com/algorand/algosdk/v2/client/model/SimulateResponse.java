package com.algorand.algosdk.v2.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.algorand.algosdk.v2.client.common.PathResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of a transaction group simulation.
 */
public class SimulateResponse extends PathResponse {

    /**
     * The round immediately preceding this simulation. State changes through this
     * round were used to run this simulation.
     */
    @JsonProperty("last-round")
    public Long lastRound;

    /**
     * A result object for each transaction group that was simulated.
     */
    @JsonProperty("txn-groups")
    public List<SimulateTransactionGroupResult> txnGroups = new ArrayList<SimulateTransactionGroupResult>();

    /**
     * The version of this response object.
     */
    @JsonProperty("version")
    public Long version;

    /**
     * Indicates whether the simulated transactions would have succeeded during an
     * actual submission. If any transaction fails or is missing a signature, this will
     * be false.
     */
    @JsonProperty("would-succeed")
    public Boolean wouldSucceed;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;

        SimulateResponse other = (SimulateResponse) o;
        if (!Objects.deepEquals(this.lastRound, other.lastRound)) return false;
        if (!Objects.deepEquals(this.txnGroups, other.txnGroups)) return false;
        if (!Objects.deepEquals(this.version, other.version)) return false;
        if (!Objects.deepEquals(this.wouldSucceed, other.wouldSucceed)) return false;

        return true;
    }
}
