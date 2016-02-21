# MaxBean
<p>
MaxBean is java command line application for automatic generate JavaBeans source code from a relational database schema.
<br> 
Here is some goods of this project:</p>

<ul>
  <li>Auto generate boring JabaBeans source code.</li>
  <li>Generate interface files for all JavaBeans.</li>
  <li>Generate Beans factory classes for creating JabaBeans from a java.sql.ResultSet.</li>
  <li>Automatic parse the java.sql.ResultSet, setting only present fields on JavaBeans.</li>
  <li>Support custom columns/fields not presents in the original tables.</li>
  <li>Allows to select only the desired tables in schema.</li>
  <li>MaxBean is open source, distributed under GNU/LGPL v3 license.</li>
</ul>
<pre>
+------------------------------------+
|  MaxBean - Database Beans Factory  |
+------------------------------------+
|             MaxBean V1             |
|  Copyright (c) 2016 Juno Roesler   |
|      <juno.roesler@bb.com.br>      |
|   Distributed under GNU/LGPL V3    |
+------------------------------------+
 Notice:
  MaxBean uses Args4j for arguments parsing (MIT License)
 Links:
  MaxBean     [http://github.com/junorr/maxbean]
  GNU/LGPL V3 [http://www.gnu.org/licenses/lgpl-3.0.en.html]
  Args4j      [http://args4j.kohsuke.org]
  MIT License [http://www.opensource.org/licenses/mit-license.php]


Usage: maxbean <-d|--db-*> <-s|-f> [-c] [-h] [-i] [-I] [-k] [-o] [-t] [-v]
  -c (--columns)   VAL: List of additional columns than those included with
                        database table. The accepted format is 
                        'table1.column1=sqlType,tableN.columnN=sqlType...'
  -d (--db-config) VAL: Database connection configuration (.properties file)
  --db-driver      VAL: Database Driver configuration 
                        (e.g. 'com.mysql.jdbc.Driver')
  --db-password    VAL: Database password
  --db-url         VAL: Database URL connection 
                        (e.g. 'jdbc:mysql://localhost:3306')
  --db-user        VAL: Database user
  -f (--file)      VAL: Properties file with schema information to generate source code
  -h (--help)         : Show this help message
  -i (--inspect)   VAL: Inspect the database and create a properties file with 
                        schema information
  -I (--identation)VAL: Set the number of spaces for source code identation
  -k (--package)   VAL: Java package for the generated source code
  -o (--output)    VAL: Output directory for MaxBean generated files
  -s (--schema)    VAL: Database Schema to inspect
  -t (--tables)    VAL: List of schema tables to inspect 
                        (comma separated: 'arg1,arg2,argN...')
  -v (--version)      : Show MaxBean version information

Usage Examples:
 * Generate source code for all tables in a schema database:
   > maxbean -d db.properties -s myschema -k com.mypack.ex
 * Inspect the database and generate a relative properties file:
   > maxbean -d db.properties -s myschema -i
 * Generate source code from a inspection file:
   > maxbean -d db.properties -f myschema.properties -k com.mypack.ex
 * Generate source code from only a couple tables:
   > maxbean -d db.properties -s myschema -k com.mypack.ex
   > ... -t "table_one table_two"
 * Generate source code with additional columns not present in tables:
   > maxbean -d db.properties -s myschema -k com.mypack.ex
   > ... -c "table_one.col_x=int table_two.col_y=varchar table_two.col_z=date"
 * Specifing database options manualy:
   > maxbean -s myschema -k com.mypack.ex
   > ... --db-driver com.mysql.jdbc.Driver --db-url jdbc:mysql://localhost:3306
   > ... --db-user myuser --db-password mypassword
</pre>
