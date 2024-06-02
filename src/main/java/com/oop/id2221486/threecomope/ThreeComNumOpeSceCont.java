package com.oop.id2221486.threecomope;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ThreeComNumOpeSceCont {
    _COM_NUM_OPERATION c1,c2,c3,c4;

    public void initialize()
    {

        COMBOW_BOX_SEC_OPERATON.getItems().addAll("add","sub","show");

    }

    @FXML
    private ComboBox<String> COMBOW_BOX_SEC_OPERATON;

    @FXML
    private TextField IMG_3rd_COM;

    @FXML
    private TextField IMG_FAST_COM;

    @FXML
    private TextField IMG_SECOND_COM;

    @FXML
    private TextField REAL_3rdCOM;

    @FXML
    private TextField REAL_FAST_COM;

    @FXML
    private TextField REAL_SECOND_COM;

    @FXML
    private CheckBox _1st_COM_NUM_CHACK_BOX;

    @FXML
    private CheckBox _2ND_COM_NUM_CHACK_BOX;

    @FXML
    private CheckBox _3rd_COM_NUM_CHACK_BOX;

    @FXML
    private TextField _PRINT_OUT_TEXT_FILD_ALL;

    @FXML
    void _EXECUTE_BUTTON_ON_CLICK(ActionEvent event) {
        c4=new _COM_NUM_OPERATION();

        c1=new _COM_NUM_OPERATION(Integer.parseInt(REAL_FAST_COM.getText()),
                Integer.parseInt(IMG_FAST_COM.getText()));
        c2=new _COM_NUM_OPERATION(Integer.parseInt(REAL_SECOND_COM.getText()),
                Integer.parseInt(IMG_SECOND_COM.getText()));
        c3=new _COM_NUM_OPERATION(Integer.parseInt(REAL_3rdCOM.getText()),
                Integer.parseInt(IMG_3rd_COM.getText()));
        _PRINT_OUT_TEXT_FILD_ALL.clear();


        int chackBoxCount=0;
        boolean First_ChackBox=false;
        boolean Second_ChackBox=false;
        boolean Third_ChackBox=false;
        if (_1st_COM_NUM_CHACK_BOX.isSelected()){
            First_ChackBox=true;
            chackBoxCount++;


        }  if (_2ND_COM_NUM_CHACK_BOX.isSelected()) {

            Second_ChackBox=true;
            chackBoxCount++;

        }  if (_3rd_COM_NUM_CHACK_BOX.isSelected()) {
            Third_ChackBox=true;
            chackBoxCount++;


        }

        if (chackBoxCount==2){
            if (COMBOW_BOX_SEC_OPERATON.getValue().equals("add")){
                if (First_ChackBox && Second_ChackBox){
                    c4=c1.add(c2);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
                if (First_ChackBox && Third_ChackBox){
                    c4=c1.add(c3);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
                if (Third_ChackBox && Second_ChackBox){
                    c4=c3.add(c2);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
            }
            if (COMBOW_BOX_SEC_OPERATON.getValue().equals("sub")){
                if (First_ChackBox && Second_ChackBox){
                    c4=c1.sub(c2);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
                if (First_ChackBox && Third_ChackBox){
                    c4=c1.sub(c3);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
                if (Third_ChackBox && Second_ChackBox){
                    c4=c3.sub(c2);
                    _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

                }
            }

           _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

        } else if (chackBoxCount==3) {
            if (COMBOW_BOX_SEC_OPERATON.getValue().equals("sub")){
                c4=c1.sub(c2).sub(c3);
                _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

            }
            if (COMBOW_BOX_SEC_OPERATON.getValue().equals("add")){
                c4=c1.add(c2).add(c3);
                _PRINT_OUT_TEXT_FILD_ALL.setText(c4.toString());

            }
        }
        else {
            _PRINT_OUT_TEXT_FILD_ALL.setText("select at least 2 chackBox");
        }


    }













}
