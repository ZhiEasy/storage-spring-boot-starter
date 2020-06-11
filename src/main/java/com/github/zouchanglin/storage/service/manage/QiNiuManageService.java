package com.github.zouchanglin.storage.service.manage;

import com.qiniu.storage.model.FetchRet;
import com.qiniu.storage.model.FileInfo;

import java.util.List;

/**
 * ��ţ�Ƶ��ļ���������
 * @author zouchanglin
 * @date 2020/6/9
 */
public interface QiNiuManageService {
    /**
     * ��ȡȫ���ļ���Ϣ�б�
     * @return �ļ���Ϣ�б�
     */
    List<FileInfo> getAllFileList();

    /**
     * ��ȡ�ļ���Ϣ
     * @param key �ļ�����(�ļ���)
     * @return �ļ���Ϣ {@link FileInfo}
     */
    FileInfo getFileInfoByKey(String key);

    /**
     * �޸��ļ�����
     * @param key �ļ�����(�ļ���)
     * @param newMimeType �ļ�����
     * @return  �޸��ļ������Ƿ�ɹ�
     */
    boolean changeMimeType(String key, String newMimeType);

    /**
     * �������ļ�
     * @param key �ļ�����(�ļ���)
     * @param newKey ���ļ���
     * @return  �������Ƿ�ɹ�
     */
    boolean renameFile(String key, String newKey);

    /**
     * �����ļ�
     * @param key �ļ�����(�ļ���)
     * @param copyKey ���Ƴ������ļ����ļ���
     * @return �����Ƿ�ɹ�
     */
    boolean copyFile(String key, String copyKey);

    /**
     * ɾ���ļ�
     * @param key �ļ�����(�ļ���)
     * @return ɾ���Ƿ�ɹ�
     */
    boolean deleteFile(String key);

    /**
     * �����ļ�����ʱ�䣬���߸����������˹���ʱ�䵫��δ��ɾ�����ļ����µĹ���ʱ��
     * @param days ��λ:��
     */
    void deleteAfterDays(String key, int days);

    /**
     * ץȡ������Դ���ռ�
     * @param url ������ԴURL
     * @param key �ļ�����
     * @return ץȡ���
     */
    FetchRet pullFileFromNetWork(String url, String key);
}