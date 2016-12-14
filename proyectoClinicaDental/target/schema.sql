
    alter table empleadotel 
        drop 
        foreign key FK_manh095ssdd3i4byjo6f6ngw2;

    alter table pacientetel 
        drop 
        foreign key FK_bunw19b2xtnr1kpc75qygk45d;

    alter table procedimientos 
        drop 
        foreign key FK_77eeu0hx0qbg5ganvcd9xfqa1;

    alter table puestoempleado 
        drop 
        foreign key FK_o3xlhq93qjky4lelw4h49gfy8;

    alter table user_role 
        drop 
        foreign key FK_it77eq964jhfqtu54081ebtio;

    alter table user_role 
        drop 
        foreign key FK_apcc8lxk2xnug8377fatvbn04;

    drop table if exists app_user;

    drop table if exists empleado;

    drop table if exists empleadotel;

    drop table if exists historialclinico;

    drop table if exists paciente;

    drop table if exists pacientetel;

    drop table if exists procedimientos;

    drop table if exists puestoempleado;

    drop table if exists role;

    drop table if exists user_role;

    create table app_user (
        id bigint not null auto_increment,
        account_expired bit not null,
        account_locked bit not null,
        address varchar(150),
        city varchar(50),
        country varchar(100),
        postal_code varchar(15),
        province varchar(100),
        credentials_expired bit not null,
        email varchar(255) not null,
        account_enabled bit,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(255) not null,
        password_hint varchar(255),
        phone_number varchar(255),
        username varchar(50) not null,
        version integer,
        website varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table empleado (
        cedula integer not null,
        apellido1 varchar(255) not null,
        apellido2 varchar(255) not null,
        correoElectronico varchar(255) not null,
        nombre varchar(255) not null,
        primary key (cedula)
    ) ENGINE=InnoDB;

    create table empleadotel (
        empleadoTel_id integer not null auto_increment,
        telefono integer,
        cedula_empleado integer not null,
        primary key (empleadoTel_id)
    ) ENGINE=InnoDB;

    create table historialclinico (
        idHistorial integer not null auto_increment,
        cedula_empleado integer not null,
        cedula_paciente integer not null,
        diagnostico varchar(255) not null,
        proximaCita date not null,
        tratamiento varchar(255) not null,
        primary key (idHistorial)
    ) ENGINE=InnoDB;

    create table paciente (
        cedula integer not null,
        apellido1 varchar(255) not null,
        apellido2 varchar(255) not null,
        correoElectronico varchar(255) not null,
        direccion varchar(255) not null,
        nombre varchar(255) not null,
        primary key (cedula)
    ) ENGINE=InnoDB;

    create table pacientetel (
        pacienteTel_id integer not null auto_increment,
        telefono integer,
        cedula_paciente integer not null,
        primary key (pacienteTel_id)
    ) ENGINE=InnoDB;

    create table procedimientos (
        idProcedimiento integer not null auto_increment,
        procedimiento varchar(255) not null,
        idHistorialClinico integer not null,
        primary key (idProcedimiento)
    ) ENGINE=InnoDB;

    create table puestoempleado (
        idPuesto integer not null auto_increment,
        codigoMedico integer not null,
        puesto varchar(255) not null,
        cedula_empleado integer not null,
        primary key (idPuesto)
    ) ENGINE=InnoDB;

    create table role (
        id bigint not null auto_increment,
        description varchar(64),
        name varchar(20),
        primary key (id)
    ) ENGINE=InnoDB;

    create table user_role (
        user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) ENGINE=InnoDB;

    alter table app_user 
        add constraint UK_1j9d9a06i600gd43uu3km82jw  unique (email);

    alter table app_user 
        add constraint UK_3k4cplvh82srueuttfkwnylq0  unique (username);

    alter table puestoempleado 
        add constraint UK_9xm2ptdp7bbw00b903jtnpv2n  unique (codigoMedico);

    alter table puestoempleado 
        add constraint UK_ow1sg4c57nd8uqei8l8n9cjwx  unique (puesto);

    alter table empleadotel 
        add constraint FK_manh095ssdd3i4byjo6f6ngw2 
        foreign key (cedula_empleado) 
        references empleado (cedula);

    alter table pacientetel 
        add constraint FK_bunw19b2xtnr1kpc75qygk45d 
        foreign key (cedula_paciente) 
        references paciente (cedula);

    alter table procedimientos 
        add constraint FK_77eeu0hx0qbg5ganvcd9xfqa1 
        foreign key (idHistorialClinico) 
        references historialclinico (idHistorial);

    alter table puestoempleado 
        add constraint FK_o3xlhq93qjky4lelw4h49gfy8 
        foreign key (cedula_empleado) 
        references empleado (cedula);

    alter table user_role 
        add constraint FK_it77eq964jhfqtu54081ebtio 
        foreign key (role_id) 
        references role (id);

    alter table user_role 
        add constraint FK_apcc8lxk2xnug8377fatvbn04 
        foreign key (user_id) 
        references app_user (id);
