<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<HTML>
    <HEAD>
        <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <TITLE>About Us</TITLE>
    </HEAD>
    
    <BODY>
        <H1>Software Technology Team:</H1>
        <TABLE BORDER='1'>
            <TR><TD COLSPAN='2' ALIGN='CENTER'>Team Members</TD></TR>
            <TR>
                <TD>Denis</TD>
                <TD>denis@mail.com</TD>
            </TR>
            <TR>
                <TD>Xristos Nikolaidis</TD>
                <TD>chrip_nmr@hotmail.com</TD>
            </TR>
            <TR>
                <TD>Antonis Xasouras</TD>
                <TD>antonis@mail.com</TD>
            </TR>
            <TR>
                <TD>Kiriakos Poursanidis</TD>
                <TD>kiriakos@mail.com</TD>
            </TR>
            <TR>
                <TD>Xristos Stilidis</TD>
                <TD>chris@mail.com</TD>
            </TR>
            <TR>
                <TD>Aristos Xatzidis</TD>
                <TD>aristos@mail.com</TD>
            </TR>
        </TABLE>
        <BR/><P>Date: <%= new java.util.Date().toString() %></P>
        <P>Write mail and click "SEND"</P>
        <FORM ACTION="sendTheMail" METHOD="POST">
            <TEXTAREA COLS="50" ROWS="10" NAME="mailMsg"></TEXTAREA>
            <INPUT TYPE="SUBMIT" VALUE="SEND"/>
        </FORM>
    </BODY>
</HTML>
