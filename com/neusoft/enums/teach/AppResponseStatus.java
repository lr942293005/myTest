package com.neusoft.enums.teach;

/**
 * <p>AppResponse״̬��</p>
 * <p>�������ڣ�2018-01-10</p>
 *
 * @author ���� yangzhou@neusoft.com
 */
public enum AppResponseStatus {

    /**
     * �����ɹ�
     */
    SUCCESS(0),

    /**
     * ����æ
     */
    SERVERS_ARE_TOO_BUSY(6),

    /**
     * δ��ѯ������
     */
    NOT_FOUND(5),

    /**
     * ����ʧ��
     */
    ERROR(-1),

    /**
     * δ��¼��token�Ƿ�
     */
    INVALID_TOKEN(2001),

    /**
     *
     */
    NO_PERMISSION(2003),

    /**
     * δ֪�쳣
     */
    UNKNOWN_EXCEPTION(3000),

    /**
     * ���ö��쳣
     */
    CLIENT_EXCEPTION(4000),

    /**
     * ��������Ƿ�
     */
    PARAM_EXCEPTION(4010),

    /**
     * ������쳣
     */
    SERVER_EXCEPTION(5000),

    /**
     * ҵ���쳣
     */
    BIZ_ERROR(10000),

    /**
     * ��֤�����
     */
    INVALID_IMAGE(6000);

    int code;

    AppResponseStatus(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}

