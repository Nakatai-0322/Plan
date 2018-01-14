package com.djrapitops.plan.system.database.databases.sql;

import com.djrapitops.plan.system.database.databases.sql.tables.*;

public class SQLOps {

    protected final SQLDB db;

    protected final UsersTable usersTable;
    protected final UserInfoTable userInfoTable;
    protected final ActionsTable actionsTable;
    protected final KillsTable killsTable;
    protected final NicknamesTable nicknamesTable;
    protected final SessionsTable sessionsTable;
    protected final IPsTable ipsTable;
    protected final CommandUseTable commandUseTable;
    protected final TPSTable tpsTable;
    protected final SecurityTable securityTable;
    protected final WorldTable worldTable;
    protected final WorldTimesTable worldTimesTable;
    protected final ServerTable serverTable;

    public SQLOps(SQLDB db) {
        this.db = db;

        usersTable = db.getUsersTable();
        userInfoTable = db.getUserInfoTable();
        actionsTable = db.getActionsTable();
        killsTable = db.getKillsTable();
        nicknamesTable = db.getNicknamesTable();
        sessionsTable = db.getSessionsTable();
        ipsTable = db.getIpsTable();
        commandUseTable = db.getCommandUseTable();
        tpsTable = db.getTpsTable();
        securityTable = db.getSecurityTable();
        worldTable = db.getWorldTable();
        worldTimesTable = db.getWorldTimesTable();
        serverTable = db.getServerTable();
    }
}
