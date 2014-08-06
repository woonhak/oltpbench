package com.oltpbenchmark.benchmarks.tpccmod.procedures;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.oltpbenchmark.api.Procedure;
import com.oltpbenchmark.benchmarks.tpccmod.TPCCWorker;

public abstract class TPCCProcedure extends Procedure {

    public abstract ResultSet run(Connection conn, Random gen,
            int terminalWarehouseID, int numWarehouses,
            int terminalDistrictLowerID, int terminalDistrictUpperID,
            TPCCWorker w) throws SQLException;

}
