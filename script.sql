-- Table Role
CREATE TABLE Role (
    role_id SERIAL PRIMARY KEY,
    role_name TEXT NOT NULL
);

-- Table User
CREATE TABLE "User" (
    user_id SERIAL PRIMARY KEY,
    user_name TEXT NOT NULL,
    password TEXT NOT NULL,
    phone_number DOUBLE PRECISION,
    role_id INTEGER REFERENCES Role(role_id)
);

-- Table StorageType
CREATE TABLE StorageType (
    storage_type_id SERIAL PRIMARY KEY,
    storage_type_name TEXT NOT NULL
);

-- Table Item
CREATE TABLE Item (
    item_id SERIAL PRIMARY KEY,
    item_name TEXT NOT NULL,
    quantity DOUBLE PRECISION NOT NULL,
    weight REAL NOT NULL,
    storage_type_id INTEGER REFERENCES StorageType(storage_type_id)
);

-- Table Cell
CREATE TABLE Cell (
    cell_id SERIAL PRIMARY KEY
);

-- Table CellItem (many-to-many relationship between Cell and Item)
CREATE TABLE CellItem (
    cell_id INTEGER REFERENCES Cell(cell_id),
    item_id INTEGER REFERENCES Item(item_id),
    user_id INTEGER REFERENCES "User"(user_id),
    PRIMARY KEY (cell_id, item_id)
);

-- Table Warehouse
CREATE TABLE Warehouse (
    warehouse_id SERIAL PRIMARY KEY,
    cell_id INTEGER REFERENCES Cell(cell_id),
    user_id INTEGER REFERENCES "User"(user_id)
);

-- Table Contract
CREATE TABLE Contract (
    contract_id SERIAL PRIMARY KEY,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    archive_date DATE,
    cell_item_id INTEGER REFERENCES CellItem(cell_id),
    user_id INTEGER REFERENCES "User"(user_id)
);

